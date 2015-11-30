/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.clazz.config.tests.markers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.TreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.provider.NattableTopLabelProvider;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;
import org.eclipse.papyrus.infra.nattable.utils.LabelProviderCellContextElementWrapper;
import org.eclipse.papyrus.infra.services.validation.EcoreDiagnostician;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.junit.framework.classification.FailingTest;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.TableUtils;
import org.eclipse.papyrus.junit.utils.rules.ActiveTable;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



/**
 * @author VL222926
 *
 */
@PluginResource("resources/validation_markers/model.di")
public class ValidationMarkerInTableHeaderTest extends AbstractPapyrusTest {

	/**
	 * the papyrus editor fixture
	 */
	@Rule
	public final PapyrusEditorFixture fixture = new PapyrusEditorFixture();

	/**
	 * the root of the model
	 */
	private Package root;

	/**
	 * the class with owns properties
	 */
	private Class classWithproperties;

	/**
	 * the class with own operation
	 */
	private Class classWithOperations;

	/**
	 * the operation
	 */
	private Operation oneOperation;

	/**
	 * the table manager
	 */
	private TreeNattableModelManager manager;


	/**
	 * the total of rows in the table
	 */
	private static final int NB_ROWS = 13;

	/**
	 * the total of columns in the table
	 */
	private static final int NB_COLUMNS = 8;


	private static final int MAX_ROWS = NB_ROWS;

	// FIXME : it seems than we have an error in getColumnCount (we get 7 instead of 8)...
	private static final int MAX_COLUMNS = NB_COLUMNS;

	/**
	 * init the JUnit test
	 */
	@Before
	public void init() {
		this.root = this.fixture.getModel();
		this.fixture.getPageManager().openPage(TableUtils.getNotationFirstTable(this.fixture.getModelSet(), "ClassTreeTable")); //$NON-NLS-1$
		INattableModelManager m = this.fixture.getActiveTableManager();
		Assert.assertTrue("TreeTableManager not found", m instanceof TreeNattableModelManager); //$NON-NLS-1$
		// these tests works only without scrollbar
        if (Display.getDefault() != null) {
               Shell shell = Display.getDefault().getActiveShell();
               if (shell != null) {
                      shell.setMaximized(true);
               }
        }

		this.manager = (TreeNattableModelManager) m;
		Assert.assertNotNull(this.root);
		List<NamedElement> rootMembers = root.getMembers();
		for (NamedElement element : rootMembers) {
			List<Element> ownedElements = element.getOwnedElements();
			if (ownedElements.size() == 1 && element instanceof Class && ownedElements.get(0) instanceof Operation) {
				this.classWithOperations = (Class) element;
				this.oneOperation = ((Operation) ownedElements.get(0));
			}
			if (ownedElements.size() == 2 && element instanceof Class && ownedElements.get(0) instanceof Property) {
				this.classWithproperties = (Class) element;
			}


		}

		Assert.assertNotNull("Class with operation not found", this.classWithOperations); //$NON-NLS-1$
		Assert.assertNotNull("Class with properties not found", this.classWithproperties); //$NON-NLS-1$
		Assert.assertNotNull("Operation not found", this.oneOperation); //$NON-NLS-1$
		this.manager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ALL, null);
		this.fixture.flushDisplayEvents();
		// we validate the model
		ValidateModelCommand cmd = new ValidateModelCommand(this.root, new EcoreDiagnostician());
		this.fixture.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(cmd));
		this.fixture.flushDisplayEvents();

		final NatTable natTable = (NatTable) manager.getAdapter(NatTable.class);
		final int rowCount = natTable.getRowCount();
		final int columnCount = natTable.getColumnCount();
		Assert.assertEquals("The number of rows is not the excpected one", NB_ROWS, rowCount); //$NON-NLS-1$
		
		//in fact , there is a bug here! 
		Assert.assertEquals("The number of columns is not the excpected one", NB_COLUMNS, columnCount); //$NON-NLS-1$
		generateMapInitializationFortestNattableTooltipProviderTests();
	
	}


	/**
	 * This test checks that there is no NPE for cells which are not representing an element (empty cell) using the getImage of the label provider
	 * 
	 * @throws Exception
	 */
	@Test
	public void testTopLabelProvider() {
		final NatTable natTable = (NatTable) manager.getAdapter(NatTable.class);
		final NattableTopLabelProvider provider = new NattableTopLabelProvider();
		final LabelProviderCellContextElementWrapper wrapper = new LabelProviderCellContextElementWrapper();
		final StringBuilder builder = new StringBuilder();
		wrapper.setConfigRegistry(natTable.getConfigRegistry());
		for (int columnPosition = 0; columnPosition < MAX_COLUMNS; columnPosition++) {
			for (int rowPosition = 0; rowPosition < MAX_ROWS; rowPosition++) {
				ILayerCell cell = natTable.getCellByPosition(columnPosition, rowPosition);
				Assert.assertNotNull(NLS.bind("Cell not found for column {0} and row {1}", columnPosition, rowPosition), cell); //$NON-NLS-1$
				wrapper.setCell(cell);
				wrapper.setObject(cell.getDataValue());
				try {
					provider.getImage(wrapper);
				} catch (Exception e) {
					builder.append(NLS.bind("The class {0} provides an exception getting the image for the  column {1} and the row {2}.\n", new Object[] { provider.getClass().getName(), columnPosition, rowPosition })); //$NON-NLS-1$
				}
			}
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);
	}

	/**
	 * 
	 * This test checks that there is no NPE for cells which are not representing an element (empty cell) using the getImage and the getText of the tooltip provider
	 * 
	 * @throws Exception
	 */
	@Test
	public void testNattableTooltipProvider() {
		final NatTable natTable = (NatTable) manager.getAdapter(NatTable.class);
		final LabelProviderCellContextElementWrapper wrapper = new LabelProviderCellContextElementWrapper();
		final TestedPapyrusNatTableToolTipProvider provider = new TestedPapyrusNatTableToolTipProvider(natTable, GridRegion.BODY, GridRegion.COLUMN_HEADER, GridRegion.ROW_HEADER);
		wrapper.setConfigRegistry(natTable.getConfigRegistry());
		final StringBuilder builder = new StringBuilder();
		// initialize the values to check
		Map<String, String> valueToCheck = new HashMap<String, String>();
		Map<String, Boolean> createToolTip = new HashMap<String, Boolean>();
		initializeMapForToolTipTests(createToolTip, valueToCheck);
		for (int columnPosition = 0; columnPosition < MAX_COLUMNS; columnPosition++) {
			for (int rowPosition = 0; rowPosition < MAX_ROWS; rowPosition++) {
				int startX = natTable.getStartXOfColumnPosition(columnPosition);
				int startY = natTable.getStartYOfRowPosition(rowPosition);
				Event event = new Event();
				event.widget = natTable;
				event.display = Display.getCurrent();
				event.x = startX + 1;
				event.y = startY + 1;
				ILayerCell gettedCell = natTable.getCellByPosition(columnPosition, rowPosition);
				StringBuffer keyBuffer = new StringBuffer();
				keyBuffer.append(columnPosition);
				keyBuffer.append("_"); //$NON-NLS-1$
				keyBuffer.append(rowPosition);
				String key = keyBuffer.toString();

				// we check than the key exist
				Assert.assertTrue(NLS.bind("We are working with an unknown key: {0}, for the column {1} and the row {2}", new Object[] { key, columnPosition, rowPosition }), createToolTip.containsKey(key)); //$NON-NLS-1$

				Assert.assertEquals(NLS.bind("The create tooltip value is not correct for the column {0} and the row {1}", columnPosition, rowPosition), createToolTip.get(key), provider.shouldCreateToolTip(event)); //$NON-NLS-1$
				if (createToolTip.get(key).booleanValue()) {
					// we check than the cells are equals
					if (gettedCell.equals(provider.getCell(event))) {


						try {
							provider.getImage(event);
						} catch (Exception e) {
							builder.append(NLS.bind("The class {0} provides an exception getting the image for the column {1} and the row {2}", new Object[] { provider.getClass().getName(), columnPosition, rowPosition })); //$NON-NLS-1$
						}

						String txt = null;
						try {
							txt = provider.getText(event);
						} catch (Exception e) {
							builder.append(NLS.bind("The class {0} provides an exception getting the text for the  column {1} and the row {2}", new Object[] { provider.getClass().getName(), columnPosition, rowPosition })); //$NON-NLS-1$
						}

						org.junit.Assert.assertNotNull(NLS.bind("We must have a tooltip for the column {0} and the row {1}", columnPosition, rowPosition), txt); //$NON-NLS-1$

					} else {
						builder.append(NLS.bind("The cells are not equals for column {0} and row {1}", columnPosition, rowPosition)); //$NON-NLS-1$
					}
				}
			}
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);
	}

	
	/**
	 * 
	 * This test checks that the good text is displayed by the tooltip
	 * 
	 * @throws Exception
	 * 
	 * @{@link FailingTest} it fails because the order of concatenated messages for an object seems changes between validations
	 */
	@Test
	@FailingTest  
	public void testNattableTooltipProviderText() {
		final NatTable natTable = (NatTable) manager.getAdapter(NatTable.class);
		final LabelProviderCellContextElementWrapper wrapper = new LabelProviderCellContextElementWrapper();
		final TestedPapyrusNatTableToolTipProvider provider = new TestedPapyrusNatTableToolTipProvider(natTable, GridRegion.BODY, GridRegion.COLUMN_HEADER, GridRegion.ROW_HEADER);
		wrapper.setConfigRegistry(natTable.getConfigRegistry());
		final StringBuilder builder = new StringBuilder();
		// initialize the values to check
		Map<String, String> valueToCheck = new HashMap<String, String>();
		Map<String, Boolean> createToolTip = new HashMap<String, Boolean>();
		initializeMapForToolTipTests(createToolTip, valueToCheck);
		for (int columnPosition = 0; columnPosition < MAX_COLUMNS; columnPosition++) {
			for (int rowPosition = 0; rowPosition < MAX_ROWS; rowPosition++) {
				int startX = natTable.getStartXOfColumnPosition(columnPosition);
				int startY = natTable.getStartYOfRowPosition(rowPosition);
				Event event = new Event();
				event.widget = natTable;
				event.display = Display.getCurrent();
				event.x = startX + 1;
				event.y = startY + 1;
				ILayerCell gettedCell = natTable.getCellByPosition(columnPosition, rowPosition);
				StringBuffer keyBuffer = new StringBuffer();
				keyBuffer.append(columnPosition);
				keyBuffer.append("_"); //$NON-NLS-1$
				keyBuffer.append(rowPosition);
				String key = keyBuffer.toString();

				// we check than the key exist
				Assert.assertTrue(NLS.bind("We are working with an unknown key: {0}, for the column {1} and the row {2}", new Object[] { key, columnPosition, rowPosition }), createToolTip.containsKey(key)); //$NON-NLS-1$

				Assert.assertEquals(NLS.bind("The create tooltip value is not correct for the column {0} and the row {1}", columnPosition, rowPosition), createToolTip.get(key), provider.shouldCreateToolTip(event)); //$NON-NLS-1$
				if (createToolTip.get(key).booleanValue()) {
					// we check than the cells are equals
					if (gettedCell.equals(provider.getCell(event))) {


						try {
							provider.getImage(event);
						} catch (Exception e) {
							builder.append(NLS.bind("The class {0} provides an exception getting the image for the column {1} and the row {2}", new Object[] { provider.getClass().getName(), columnPosition, rowPosition })); //$NON-NLS-1$
						}

						String txt = null;
						try {
							txt = provider.getText(event);
						} catch (Exception e) {
							builder.append(NLS.bind("The class {0} provides an exception getting the text for the  column {1} and the row {2}", new Object[] { provider.getClass().getName(), columnPosition, rowPosition })); //$NON-NLS-1$
						}

						org.junit.Assert.assertEquals(NLS.bind("The value for the key {0} is not the wanted value", key), valueToCheck.get(key), txt);//$NON-NLS-1$

					} else {
						builder.append(NLS.bind("The cells are not equals for column {0} and row {1}", columnPosition, rowPosition)); //$NON-NLS-1$
					}
				}
			}
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);
	}

	/**
	 * This method can be used to generate the map initialization for the test method {@link #testNattableTooltipProvider()}
	 */
	public void generateMapInitializationFortestNattableTooltipProviderTests() {
		final NatTable natTable = (NatTable) manager.getAdapter(NatTable.class);
		final LabelProviderCellContextElementWrapper wrapper = new LabelProviderCellContextElementWrapper();
		final TestedPapyrusNatTableToolTipProvider provider = new TestedPapyrusNatTableToolTipProvider(natTable, GridRegion.BODY, GridRegion.COLUMN_HEADER, GridRegion.ROW_HEADER);
		wrapper.setConfigRegistry(natTable.getConfigRegistry());
		for (int columnPosition = 0; columnPosition < MAX_COLUMNS; columnPosition++) {
			for (int rowPosition = 0; rowPosition < MAX_ROWS; rowPosition++) {
				int startX = natTable.getStartXOfColumnPosition(columnPosition);
				int startY = natTable.getStartYOfRowPosition(rowPosition);
				Event event = new Event();
				event.widget = natTable;
				event.display = Display.getCurrent();
				event.x = startX + 1;
				event.y = startY + 1;

				StringBuffer keyBuffer = new StringBuffer();
				keyBuffer.append(columnPosition);
				keyBuffer.append("_"); //$NON-NLS-1$
				keyBuffer.append(rowPosition);
				String key = keyBuffer.toString();

				// code to generate the values to check
				if (provider.shouldCreateToolTip(event)) {
					String txt = provider.getText(event);
					System.out.println(NLS.bind("createToolTip.put(\"{0}\", true); //$NON-NLS-1$", new Object[] { key, rowPosition })); //$NON-NLS-1$
					txt = txt.replaceAll("\n", "\\\\n"); //$NON-NLS-1$ //$NON-NLS-2$
					System.out.println(NLS.bind("valuesToCheck.put(\"{0}\", \"{1}\"); //$NON-NLS-1$ //$NON-NLS-2$", new Object[] { key, txt })); //$NON-NLS-1$
				} else {
					System.out.println(NLS.bind("createToolTip.put(\"{0}\", false); //$NON-NLS-1$", new Object[] { key, rowPosition })); //$NON-NLS-1$
				}
			}
		}
	}

	/**
	 * 
	 * @param createToolTip
	 *            the map to know if a tooltip must be displayed
	 * @param valuesToCheck
	 *            the map with the error messages to get
	 * 
	 *            The code of this method has been generated using the method {@link #generateMapInitializationFortestNattableTooltipProviderTests()}
	 */
	private void initializeMapForToolTipTests(final Map<String, Boolean> createToolTip, final Map<String, String> valuesToCheck) {
		createToolTip.put("0_0", false); //$NON-NLS-1$
		createToolTip.put("0_1", false); //$NON-NLS-1$
		createToolTip.put("0_2", false); //$NON-NLS-1$
		createToolTip.put("0_3", false); //$NON-NLS-1$
		createToolTip.put("0_4", false); //$NON-NLS-1$
		createToolTip.put("0_5", false); //$NON-NLS-1$
		createToolTip.put("0_6", false); //$NON-NLS-1$
		createToolTip.put("0_7", false); //$NON-NLS-1$
		createToolTip.put("0_8", false); //$NON-NLS-1$
		createToolTip.put("0_9", false); //$NON-NLS-1$
		createToolTip.put("0_10", false); //$NON-NLS-1$
		createToolTip.put("0_11", false); //$NON-NLS-1$
		createToolTip.put("0_12", false); //$NON-NLS-1$
		createToolTip.put("1_0", false); //$NON-NLS-1$
		createToolTip.put("1_1", false); //$NON-NLS-1$
		createToolTip.put("1_2", false); //$NON-NLS-1$
		createToolTip.put("1_3", false); //$NON-NLS-1$
		createToolTip.put("1_4", false); //$NON-NLS-1$
		createToolTip.put("1_5", false); //$NON-NLS-1$
		createToolTip.put("1_6", false); //$NON-NLS-1$
		createToolTip.put("1_7", false); //$NON-NLS-1$
		createToolTip.put("1_8", false); //$NON-NLS-1$
		createToolTip.put("1_9", false); //$NON-NLS-1$
		createToolTip.put("1_10", false); //$NON-NLS-1$
		createToolTip.put("1_11", false); //$NON-NLS-1$
		createToolTip.put("1_12", false); //$NON-NLS-1$
		createToolTip.put("2_0", false); //$NON-NLS-1$
		createToolTip.put("2_1", false); //$NON-NLS-1$
		createToolTip.put("2_2", false); //$NON-NLS-1$
		createToolTip.put("2_3", true); //$NON-NLS-1$
		valuesToCheck.put("2_3", "RootElement::Class1 (Class)\nNamed element '<Class> Class1' is not distinguishable from all other members of namespace '<Model>\n  RootElement'.\nNamed element RootElement::Class1::Property1 is not distinguishable from all other members of\n  namespace RootElement::Class1.\nNamed element RootElement::Class1::Property1 is not distinguishable from all other members of\n  namespace RootElement::Class1.\nNot all the members of namespace RootElement::Class1 are distinguishable within it.\nNot all the members of namespace '<Class> Class1' are distinguishable within it.\n2 warnings(s) in the children"); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("2_4", false); //$NON-NLS-1$
		createToolTip.put("2_5", false); //$NON-NLS-1$
		createToolTip.put("2_6", false); //$NON-NLS-1$
		createToolTip.put("2_7", true); //$NON-NLS-1$
		valuesToCheck.put("2_7", "RootElement::Class1 (Class)\nNamed element '<Class> Class1' is not distinguishable from all other members of namespace '<Model>\n  RootElement'.\n6 warnings(s) in the children"); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("2_8", false); //$NON-NLS-1$
		createToolTip.put("2_9", false); //$NON-NLS-1$
		createToolTip.put("2_10", false); //$NON-NLS-1$
		createToolTip.put("2_11", false); //$NON-NLS-1$
		createToolTip.put("2_12", false); //$NON-NLS-1$
		createToolTip.put("3_0", false); //$NON-NLS-1$
		createToolTip.put("3_1", false); //$NON-NLS-1$
		createToolTip.put("3_2", false); //$NON-NLS-1$
		createToolTip.put("3_3", false); //$NON-NLS-1$
		createToolTip.put("3_4", false); //$NON-NLS-1$
		createToolTip.put("3_5", false); //$NON-NLS-1$
		createToolTip.put("3_6", false); //$NON-NLS-1$
		createToolTip.put("3_7", false); //$NON-NLS-1$
		createToolTip.put("3_8", false); //$NON-NLS-1$
		createToolTip.put("3_9", false); //$NON-NLS-1$
		createToolTip.put("3_10", false); //$NON-NLS-1$
		createToolTip.put("3_11", false); //$NON-NLS-1$
		createToolTip.put("3_12", false); //$NON-NLS-1$
		createToolTip.put("4_0", false); //$NON-NLS-1$
		createToolTip.put("4_1", false); //$NON-NLS-1$
		createToolTip.put("4_2", false); //$NON-NLS-1$
		createToolTip.put("4_3", false); //$NON-NLS-1$
		createToolTip.put("4_4", false); //$NON-NLS-1$
		createToolTip.put("4_5", true); //$NON-NLS-1$
		valuesToCheck.put("4_5", "RootElement::Class1::Property1 (Property)\nNamed element '<Property> Property1' is not distinguishable from all other members of namespace\n  '<Class> Class1'."); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("4_6", true); //$NON-NLS-1$
		valuesToCheck.put("4_6", "RootElement::Class1::Property1 (Property)\nNamed element '<Property> Property1' is not distinguishable from all other members of namespace\n  '<Class> Class1'."); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("4_7", false); //$NON-NLS-1$
		createToolTip.put("4_8", false); //$NON-NLS-1$
		createToolTip.put("4_9", true); //$NON-NLS-1$
		valuesToCheck.put("4_9", "RootElement::Class1::Operation1 (Operation)\nNot all the members of namespace RootElement::Class1::Operation1 are distinguishable within it.\nNamed element RootElement::Class1::Operation1::Parameter1 is not distinguishable from all other\n  members of namespace RootElement::Class1::Operation1.\nNot all the members of namespace '<Operation> Operation1 (Parameter1, Parameter1)' are\n  distinguishable within it.\nNamed element RootElement::Class1::Operation1::Parameter1 is not distinguishable from all other\n  members of namespace RootElement::Class1::Operation1.\n2 warnings(s) in the children"); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("4_10", false); //$NON-NLS-1$
		createToolTip.put("4_11", false); //$NON-NLS-1$
		createToolTip.put("4_12", false); //$NON-NLS-1$
		createToolTip.put("5_0", false); //$NON-NLS-1$
		createToolTip.put("5_1", false); //$NON-NLS-1$
		createToolTip.put("5_2", false); //$NON-NLS-1$
		createToolTip.put("5_3", false); //$NON-NLS-1$
		createToolTip.put("5_4", false); //$NON-NLS-1$
		createToolTip.put("5_5", false); //$NON-NLS-1$
		createToolTip.put("5_6", false); //$NON-NLS-1$
		createToolTip.put("5_7", false); //$NON-NLS-1$
		createToolTip.put("5_8", false); //$NON-NLS-1$
		createToolTip.put("5_9", false); //$NON-NLS-1$
		createToolTip.put("5_10", false); //$NON-NLS-1$
		createToolTip.put("5_11", false); //$NON-NLS-1$
		createToolTip.put("5_12", false); //$NON-NLS-1$
		createToolTip.put("6_0", false); //$NON-NLS-1$
		createToolTip.put("6_1", false); //$NON-NLS-1$
		createToolTip.put("6_2", false); //$NON-NLS-1$
		createToolTip.put("6_3", false); //$NON-NLS-1$
		createToolTip.put("6_4", false); //$NON-NLS-1$
		createToolTip.put("6_5", false); //$NON-NLS-1$
		createToolTip.put("6_6", false); //$NON-NLS-1$
		createToolTip.put("6_7", false); //$NON-NLS-1$
		createToolTip.put("6_8", false); //$NON-NLS-1$
		createToolTip.put("6_9", false); //$NON-NLS-1$
		createToolTip.put("6_10", false); //$NON-NLS-1$
		createToolTip.put("6_11", true); //$NON-NLS-1$
		valuesToCheck.put("6_11", "RootElement::Class1::Operation1::Parameter1 (Parameter)\nNamed element '<Parameter> Parameter1' is not distinguishable from all other members of namespace\n  '<Operation> Operation1 (Parameter1, Parameter1)'."); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("6_12", true); //$NON-NLS-1$
		valuesToCheck.put("6_12", "RootElement::Class1::Operation1::Parameter1 (Parameter)\nNamed element '<Parameter> Parameter1' is not distinguishable from all other members of namespace\n  '<Operation> Operation1 (Parameter1, Parameter1)'."); //$NON-NLS-1$ //$NON-NLS-2$
		createToolTip.put("7_0", false); //$NON-NLS-1$
		createToolTip.put("7_1", false); //$NON-NLS-1$
		createToolTip.put("7_2", false); //$NON-NLS-1$
		createToolTip.put("7_3", false); //$NON-NLS-1$
		createToolTip.put("7_4", false); //$NON-NLS-1$
		createToolTip.put("7_5", false); //$NON-NLS-1$
		createToolTip.put("7_6", false); //$NON-NLS-1$
		createToolTip.put("7_7", false); //$NON-NLS-1$
		createToolTip.put("7_8", false); //$NON-NLS-1$
		createToolTip.put("7_9", false); //$NON-NLS-1$
		createToolTip.put("7_10", false); //$NON-NLS-1$
		createToolTip.put("7_11", false); //$NON-NLS-1$
		createToolTip.put("7_12", false); //$NON-NLS-1$
	}
}