/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Nicolas FAUVERGUE (ALL4TEC) nicolas.fauvergue@all4tec.net - Bug 476618
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.nebula.widgets.nattable.coordinate.PositionCoordinate;

/**
 * Wrapper for the selection in the table
 */
public class TableSelectionWrapper {

	/**
	 * the list of the coordinate of all selected cells
	 */
	final private Collection<PositionCoordinate> selectedCells;

	/**
	 * a map linking index of selected rows and the object in the selected row
	 */
	final private Map<Integer, Object> fullySelectedRowsObject;

	/**
	 * a map linking index of selected column and the object in the selected column
	 */
	final private Map<Integer, Object> fullySelectionColumnsObject;

	/**
	 * Constructor.
	 *
	 * @param selectionCells
	 *            The selected cells.
	 */
	public TableSelectionWrapper(final Collection<PositionCoordinate> selectionCells) {
		this(selectionCells, Collections.<Integer, Object> emptyMap(), Collections.<Integer, Object> emptyMap());
	}

	/**
	 * Constructor.
	 *
	 * @param selectionCells
	 *            The selected cells.
	 * @param fullySelectedRowObject
	 *            The selected rows (index or object affected).
	 * @param fullySelectedColumnObject
	 *            The selected columns (index or object affected).
	 */
	public TableSelectionWrapper(final Collection<PositionCoordinate> selectionCells, final Map<Integer, Object> fullySelectedRowObject, final Map<Integer, Object> fullySelectedColumnObject) {
		this.selectedCells = selectionCells;
		this.fullySelectedRowsObject = fullySelectedRowObject;
		this.fullySelectionColumnsObject = fullySelectedColumnObject;
	}

	/**
	 * Get the selected cells.
	 * 
	 * @return
	 * 		the list of the {@link PositionCoordinate} of all selected cells
	 */
	public Collection<PositionCoordinate> getSelectedCells() {
		return selectedCells;
	}

	/**
	 * Get the selected rows.
	 * 
	 * @return
	 * 		a map with the fully selected rows and their index
	 */
	public Map<Integer, Object> getFullySelectedRows() {
		return this.fullySelectedRowsObject;
	}

	/**
	 * Get the selected columns.
	 * 
	 * @return
	 * 		a map with the fully selected rows and their columns
	 */
	public Map<Integer, Object> getFullySelectedColumns() {
		return this.fullySelectionColumnsObject;
	}

	/**
	 * Rturns a boolean determining if at least one selected cell is outside of the selected rows and columns.
	 * 
	 * @return <code>true</code> if at least one selected cell is outside of the selected rows and columns, <code>false</code> otherwise.
	 */
	public boolean isCellsOutsideOfAxis() {
		boolean result = false;

		if ((null != this.selectedCells && !this.selectedCells.isEmpty()) && ((null != this.fullySelectedRowsObject && !this.fullySelectedRowsObject.isEmpty()) || (null != this.fullySelectionColumnsObject && !this.fullySelectionColumnsObject.isEmpty()))) {

			// Loop on each selected cells to manage if one cell is outside of selected rows or columns
			final Iterator<PositionCoordinate> selectedCells = this.selectedCells.iterator();
			while (!result && selectedCells.hasNext()) {
				final PositionCoordinate selectedCell = selectedCells.next();

				boolean contains = false;
				// Check that the selected cell is not outside of the selected rows
				if (null != this.fullySelectedRowsObject && !this.fullySelectedRowsObject.isEmpty() && this.fullySelectedRowsObject.containsKey(selectedCell.getRowPosition())) {
					contains = true;
				}
				// Check that the selected cell is not outside of the selected columns
				if (null != this.fullySelectionColumnsObject && !this.fullySelectionColumnsObject.isEmpty() && this.fullySelectionColumnsObject.containsKey(selectedCell.getColumnPosition())) {
					contains = true;
				}

				result = !contains;
			}
		}

		return result;
	}

	/**
	 * Check if the selected rows are continuous.
	 * 
	 * @return <code>true</code> if the selected rows are continuous, <code>false</code> otherwise.
	 */
	public boolean isContinuousRows(){
		int firstRowIndex = -1;
		int lastRowIndex = -1;
		
		// To check if the selected rows are continuous, calculate :
		//   - The first row index
		//   - The last row index
		// To finalize : 
		//   - The number of selected rows must be equals to last index subtracted to the first index
		for(final int rowIndex : getFullySelectedRows().keySet()){
			if(-1 == firstRowIndex || rowIndex < firstRowIndex){
				firstRowIndex = rowIndex;
			}
			if(-1 == lastRowIndex || rowIndex > lastRowIndex){
				lastRowIndex = rowIndex;
			}
		}
		
		return (lastRowIndex-firstRowIndex+1) == getFullySelectedRows().size();
	}
	
	/**
	 * Check if the selected columns are continuous.
	 * 
	 * @return <code>true</code> if the selected columns are continuous, <code>false</code> otherwise.
	 */
	public boolean isContinuousColumns(){
		int firstColumnIndex = -1;
		int lastColumnIndex = -1;
		
		// To check if the selected columns are continuous, calculate :
		//   - The first column index
		//   - The last column index
		// To finalize : 
		//   - The number of selected column must be equals to last index subtracted to the first index
		for(final int rowIndex : getFullySelectedColumns().keySet()){
			if(-1 == firstColumnIndex || rowIndex < firstColumnIndex){
				firstColumnIndex = rowIndex;
			}
			if(-1 == lastColumnIndex || rowIndex > lastColumnIndex){
				lastColumnIndex = rowIndex;
			}
		}
		
		return (lastColumnIndex-firstColumnIndex+1) == getFullySelectedColumns().size();
	}
	
	/**
	 * Check if the selected cells are continuous.
	 * 
	 * @return <code>true</code> if the selected cells are continuous, <code>false</code> otherwise.
	 */
	public boolean isContinuousCells(){
		int firstRowIndex = -1;
		int lastRowIndex = -1;
		int firstColumnIndex = -1;
		int lastColumnIndex = -1;
		
		// To check if the selected cells are continuous, calculate :
		//   - The first row index
		//   - The last row index
		//   - The first column index
		//   - The last column index
		// To finalize : 
		//   - The number of selected cells must be equals to number of row index multiplied to number of column index
		for(final PositionCoordinate currentPosition : getSelectedCells()){
			if(-1 == firstRowIndex || currentPosition.getRowPosition() < firstRowIndex){
				firstRowIndex = currentPosition.getRowPosition();
			}
			if(-1 == firstColumnIndex || currentPosition.getColumnPosition() < firstColumnIndex){
				firstColumnIndex = currentPosition.getColumnPosition();
			}
			if(-1 == lastRowIndex || currentPosition.getRowPosition() > lastRowIndex){
				lastRowIndex = currentPosition.getRowPosition();
			}
			if(-1 == lastColumnIndex || currentPosition.getColumnPosition() > lastColumnIndex){
				lastColumnIndex = currentPosition.getColumnPosition();
			}
		}
		
		return ((lastColumnIndex - firstColumnIndex + 1) * (lastRowIndex - firstRowIndex + 1)) == getSelectedCells().size();
	}

	/**
	 * This method clear the values stored in the collections and in the maps of this wrapper
	 */
	public void clearWrappedSelection() {
		this.fullySelectedRowsObject.clear();
		this.fullySelectionColumnsObject.clear();
		this.selectedCells.clear();
	}

}
