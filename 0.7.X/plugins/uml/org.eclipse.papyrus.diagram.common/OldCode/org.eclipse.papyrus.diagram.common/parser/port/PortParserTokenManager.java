/* Generated By:JavaCC: Do not edit this line. PortParserTokenManager.java */
/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */
package org.eclipse.papyrus.diagram.common.parser.port;

public class PortParserTokenManager implements PortParserConstants {

	public java.io.PrintStream debugStream = System.out;

	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(int pos, long active0) {
		switch (pos) {
		case 0:
			if ((active0 & 0x1fe0000L) != 0L) {
				jjmatchedKind = 26;
				return 2;
			}
			return -1;
		case 1:
			if ((active0 & 0x1fe0000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 1;
				return 2;
			}
			return -1;
		case 2:
			if ((active0 & 0x1fe0000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 2;
				return 2;
			}
			return -1;
		case 3:
			if ((active0 & 0x1fe0000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 3;
				return 2;
			}
			return -1;
		case 4:
			if ((active0 & 0x40000L) != 0L)
				return 2;
			if ((active0 & 0x1fa0000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 4;
				return 2;
			}
			return -1;
		case 5:
			if ((active0 & 0x800000L) != 0L)
				return 2;
			if ((active0 & 0x17a0000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 5;
				return 2;
			}
			return -1;
		case 6:
			if ((active0 & 0x280000L) != 0L)
				return 2;
			if ((active0 & 0x1520000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 6;
				return 2;
			}
			return -1;
		case 7:
			if ((active0 & 0x20000L) != 0L)
				return 2;
			if ((active0 & 0x1500000L) != 0L) {
				jjmatchedKind = 26;
				jjmatchedPos = 7;
				return 2;
			}
			return -1;
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(int pos, long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private final int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private final int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	private final int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 9:
			return jjStopAtPos(0, 2);
		case 32:
			return jjStopAtPos(0, 1);
		case 35:
			return jjStopAtPos(0, 13);
		case 42:
			return jjStopAtPos(0, 16);
		case 43:
			return jjStopAtPos(0, 11);
		case 44:
			return jjStopAtPos(0, 10);
		case 45:
			return jjStopAtPos(0, 12);
		case 46:
			return jjStopAtPos(0, 15);
		case 47:
			return jjStopAtPos(0, 3);
		case 58:
			return jjStopAtPos(0, 4);
		case 61:
			return jjStopAtPos(0, 5);
		case 91:
			return jjStopAtPos(0, 6);
		case 93:
			return jjStopAtPos(0, 7);
		case 110:
			return jjMoveStringLiteralDfa1_0(0x1000000L);
		case 111:
			return jjMoveStringLiteralDfa1_0(0x200000L);
		case 114:
			return jjMoveStringLiteralDfa1_0(0x120000L);
		case 115:
			return jjMoveStringLiteralDfa1_0(0x80000L);
		case 117:
			return jjMoveStringLiteralDfa1_0(0xc40000L);
		case 123:
			return jjStopAtPos(0, 8);
		case 125:
			return jjStopAtPos(0, 9);
		case 126:
			return jjStopAtPos(0, 14);
		default:
			return jjMoveNfa_0(1, 0);
		}
	}

	private final int jjMoveStringLiteralDfa1_0(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case 101:
			return jjMoveStringLiteralDfa2_0(active0, 0x120000L);
		case 110:
			return jjMoveStringLiteralDfa2_0(active0, 0xc40000L);
		case 111:
			return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
		case 114:
			return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
		case 117:
			return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
		default:
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private final int jjMoveStringLiteralDfa2_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(0, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(1, active0);
			return 2;
		}
		switch (curChar) {
		case 97:
			return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
		case 98:
			return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
		case 100:
			return jjMoveStringLiteralDfa3_0(active0, 0x300000L);
		case 105:
			return jjMoveStringLiteralDfa3_0(active0, 0x840000L);
		case 110:
			return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
		case 111:
			return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
		default:
			break;
		}
		return jjStartNfa_0(1, active0);
	}

	private final int jjMoveStringLiteralDfa3_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(1, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(2, active0);
			return 3;
		}
		switch (curChar) {
		case 100:
			return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
		case 101:
			return jjMoveStringLiteralDfa4_0(active0, 0x300000L);
		case 111:
			return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
		case 113:
			return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
		case 114:
			return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
		case 115:
			return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
		case 117:
			return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
		default:
			break;
		}
		return jjStartNfa_0(2, active0);
	}

	private final int jjMoveStringLiteralDfa4_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(2, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(3, active0);
			return 4;
		}
		switch (curChar) {
		case 79:
			return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
		case 100:
			return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
		case 101:
			return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
		case 102:
			return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
		case 110:
			if ((active0 & 0x40000L) != 0L)
				return jjStartNfaWithStates_0(4, 18, 2);
			return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
		case 114:
			return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
		case 117:
			return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
		default:
			break;
		}
		return jjStartNfa_0(3, active0);
	}

	private final int jjMoveStringLiteralDfa5_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(3, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(4, active0);
			return 5;
		}
		switch (curChar) {
		case 101:
			if ((active0 & 0x800000L) != 0L)
				return jjStartNfaWithStates_0(5, 23, 2);
			return jjMoveStringLiteralDfa6_0(active0, 0x600000L);
		case 105:
			return jjMoveStringLiteralDfa6_0(active0, 0x1100000L);
		case 110:
			return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
		case 116:
			return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
		default:
			break;
		}
		return jjStartNfa_0(4, active0);
	}

	private final int jjMoveStringLiteralDfa6_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(4, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(5, active0);
			return 6;
		}
		switch (curChar) {
		case 100:
			if ((active0 & 0x200000L) != 0L)
				return jjStartNfaWithStates_0(6, 21, 2);
			break;
		case 108:
			return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
		case 110:
			return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
		case 113:
			return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
		case 114:
			return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
		case 115:
			if ((active0 & 0x80000L) != 0L)
				return jjStartNfaWithStates_0(6, 19, 2);
			break;
		default:
			break;
		}
		return jjStartNfa_0(5, active0);
	}

	private final int jjMoveStringLiteralDfa7_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(5, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(6, active0);
			return 7;
		}
		switch (curChar) {
		case 101:
			return jjMoveStringLiteralDfa8_0(active0, 0x500000L);
		case 117:
			return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
		case 121:
			if ((active0 & 0x20000L) != 0L)
				return jjStartNfaWithStates_0(7, 17, 2);
			break;
		default:
			break;
		}
		return jjStartNfa_0(6, active0);
	}

	private final int jjMoveStringLiteralDfa8_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(6, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(7, active0);
			return 8;
		}
		switch (curChar) {
		case 100:
			if ((active0 & 0x400000L) != 0L)
				return jjStartNfaWithStates_0(8, 22, 2);
			break;
		case 101:
			if ((active0 & 0x1000000L) != 0L)
				return jjStartNfaWithStates_0(8, 24, 2);
			break;
		case 115:
			if ((active0 & 0x100000L) != 0L)
				return jjStartNfaWithStates_0(8, 20, 2);
			break;
		default:
			break;
		}
		return jjStartNfa_0(7, active0);
	}

	private final void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private final void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private final void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private final void jjCheckNAddStates(int start, int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

	private final void jjCheckNAddStates(int start) {
		jjCheckNAdd(jjnextStates[start]);
		jjCheckNAdd(jjnextStates[start + 1]);
	}

	static final long[] jjbitVec0 = { 0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L };

	static final long[] jjbitVec2 = { 0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL };

	static final long[] jjbitVec3 = { 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL };

	static final long[] jjbitVec4 = { 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L };

	static final long[] jjbitVec5 = { 0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L };

	static final long[] jjbitVec6 = { 0x3fffffffffffL, 0x0L, 0x0L, 0x0L };

	private final int jjMoveNfa_0(int startState, int curPos) {
		int[] nextStates;
		int startsAt = 0;
		jjnewStateCnt = 3;
		int i = 1;
		jjstateSet[0] = startState;
		int j, kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 1:
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 25)
								kind = 25;
							jjCheckNAdd(0);
						} else if (curChar == 36) {
							if (kind > 26)
								kind = 26;
							jjCheckNAdd(2);
						}
						break;
					case 0:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 25)
							kind = 25;
						jjCheckNAdd(0);
						break;
					case 2:
						if ((0x3ff001000000000L & l) == 0L)
							break;
						if (kind > 26)
							kind = 26;
						jjCheckNAdd(2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 1:
					case 2:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 26)
							kind = 26;
						jjCheckNAdd(2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int hiByte = (curChar >> 8);
				int i1 = hiByte >> 6;
				long l1 = 1L << (hiByte & 077);
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 1:
					case 2:
						if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
							break;
						if (kind > 26)
							kind = 26;
						jjCheckNAdd(2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	static final int[] jjnextStates = {};

	private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2) {
		switch (hiByte) {
		case 0:
			return ((jjbitVec2[i2] & l2) != 0L);
		case 48:
			return ((jjbitVec3[i2] & l2) != 0L);
		case 49:
			return ((jjbitVec4[i2] & l2) != 0L);
		case 51:
			return ((jjbitVec5[i2] & l2) != 0L);
		case 61:
			return ((jjbitVec6[i2] & l2) != 0L);
		default:
			if ((jjbitVec0[i1] & l1) != 0L)
				return true;
			return false;
		}
	}

	public static final String[] jjstrLiteralImages = {
			"", null, null, "\57", "\72", "\75", "\133", "\135", "\173", "\175", "\54", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$
			"\53", "\55", "\43", "\176", "\56", "\52", "\162\145\141\144\117\156\154\171", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
			"\165\156\151\157\156", "\163\165\142\163\145\164\163", "\162\145\144\145\146\151\156\145\163", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			"\157\162\144\145\162\145\144", "\165\156\157\162\144\145\162\145\144", "\165\156\151\161\165\145", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			"\156\157\156\165\156\151\161\165\145", null, null, null, null, }; //$NON-NLS-1$

	public static final String[] lexStateNames = { "DEFAULT", //$NON-NLS-1$
	};

	static final long[] jjtoToken = { 0x7fffff9L, };

	static final long[] jjtoSkip = { 0x6L, };

	static final long[] jjtoSpecial = { 0x6L, };

	protected JavaCharStream input_stream;

	private final int[] jjrounds = new int[3];

	private final int[] jjstateSet = new int[6];

	protected char curChar;

	public PortParserTokenManager(JavaCharStream stream) {
		if (JavaCharStream.staticFlag)
			throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer."); //$NON-NLS-1$
		input_stream = stream;
	}

	public PortParserTokenManager(JavaCharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	public void ReInit(JavaCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private final void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 3; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}

	public void ReInit(JavaCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	public void SwitchTo(int lexState) {
		if (lexState >= 1 || lexState < 0)
			throw new TokenMgrError(
					"Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE); //$NON-NLS-1$ //$NON-NLS-2$
		else
			curLexState = lexState;
	}

	protected Token jjFillToken() {
		Token t = Token.newToken(jjmatchedKind);
		t.kind = jjmatchedKind;
		String im = jjstrLiteralImages[jjmatchedKind];
		t.image = (im == null) ? input_stream.GetImage() : im;
		t.beginLine = input_stream.getBeginLine();
		t.beginColumn = input_stream.getBeginColumn();
		t.endLine = input_stream.getEndLine();
		t.endColumn = input_stream.getEndColumn();
		return t;
	}

	int curLexState = 0;

	int defaultLexState = 0;

	int jjnewStateCnt;

	int jjround;

	int jjmatchedPos;

	int jjmatchedKind;

	public Token getNextToken() {
		int kind;
		Token specialToken = null;
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				matchedToken.specialToken = specialToken;
				return matchedToken;
			}

			jjmatchedKind = 0x7fffffff;
			jjmatchedPos = 0;
			curPos = jjMoveStringLiteralDfa0_0();
			if (jjmatchedKind != 0x7fffffff) {
				if (jjmatchedPos + 1 < curPos)
					input_stream.backup(curPos - jjmatchedPos - 1);
				if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
					matchedToken = jjFillToken();
					matchedToken.specialToken = specialToken;
					return matchedToken;
				} else {
					if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						matchedToken = jjFillToken();
						if (specialToken == null)
							specialToken = matchedToken;
						else {
							matchedToken.specialToken = specialToken;
							specialToken = (specialToken.next = matchedToken);
						}
					}
					continue EOFLoop;
				}
			}
			int error_line = input_stream.getEndLine();
			int error_column = input_stream.getEndColumn();
			String error_after = null;
			boolean EOFSeen = false;
			try {
				input_stream.readChar();
				input_stream.backup(1);
			} catch (java.io.IOException e1) {
				EOFSeen = true;
				error_after = curPos <= 1 ? "" : input_stream.GetImage(); //$NON-NLS-1$
				if (curChar == '\n' || curChar == '\r') {
					error_line++;
					error_column = 0;
				} else
					error_column++;
			}
			if (!EOFSeen) {
				input_stream.backup(1);
				error_after = curPos <= 1 ? "" : input_stream.GetImage(); //$NON-NLS-1$
			}
			throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
					TokenMgrError.LEXICAL_ERROR);
		}
	}

}
