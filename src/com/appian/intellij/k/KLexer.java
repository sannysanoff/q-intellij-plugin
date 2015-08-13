/* The following code was generated by JFlex 1.4.3 on 8/12/15 11:59 PM */

package com.appian.intellij.k;

import static com.appian.intellij.k.psi.KTypes.*;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/12/15 11:59 PM from the specification file
 * <tt>/Users/antonio.andrade/ae/k-intellij-plugin/src/com/appian/intellij/k/k.flex</tt>
 */
class KLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\21\1\16"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\14\1\32"+
    "\1\10\1\6\1\4\1\11\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\3\12\1\33\1\34\1\35\1\36\1\37\1\40\1\41\4\5\1\13"+
    "\3\5\1\15\4\5\1\15\14\5\1\42\1\17\1\43\1\44\1\7"+
    "\1\20\3\5\1\62\1\67\1\61\1\5\1\65\1\60\2\5\1\66"+
    "\1\5\1\51\1\63\7\5\1\64\3\5\1\45\1\46\1\47\1\50"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\2\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\6\10\3\4\1\45"+
    "\1\46\1\47\1\50\1\10\1\0\2\10\1\51\1\0"+
    "\1\52\1\0\1\53\2\54\1\0\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\1\4\2\45"+
    "\2\10\1\52\1\54\1\0\1\4\1\54\1\4\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\160\0\u0150"+
    "\0\u0188\0\u01c0\0\u01f8\0\160\0\u0230\0\u0268\0\u02a0\0\160"+
    "\0\160\0\160\0\160\0\160\0\u02d8\0\160\0\160\0\160"+
    "\0\160\0\160\0\160\0\160\0\160\0\160\0\160\0\160"+
    "\0\160\0\160\0\160\0\160\0\160\0\160\0\160\0\u0310"+
    "\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0"+
    "\0\u0508\0\160\0\u0540\0\u0540\0\u0578\0\u05b0\0\u05e8\0\160"+
    "\0\160\0\u0230\0\160\0\u0620\0\160\0\u0658\0\u0690\0\u06c8"+
    "\0\160\0\160\0\160\0\160\0\160\0\160\0\160\0\u0118"+
    "\0\u0118\0\u0700\0\u0738\0\160\0\u0770\0\u07a8\0\u0230\0\160"+
    "\0\u07e0\0\u0818\0\u06c8\0\u0850\0\u0118";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\6\1\14\1\6\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\6"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\6"+
    "\1\57\1\6\1\60\3\6\1\3\3\4\1\61\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\6\1\14\1\6"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\6\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\6\1\57\1\6\1\60\3\6"+
    "\71\0\3\4\1\61\116\0\1\62\41\0\3\6\1\0"+
    "\3\6\1\0\1\6\33\0\17\6\5\0\1\63\5\0"+
    "\1\63\1\0\1\63\33\0\1\64\6\0\10\63\11\0"+
    "\1\65\1\13\37\0\6\13\16\0\1\66\4\0\1\67"+
    "\1\0\1\70\15\0\1\71\15\0\1\70\6\0\1\70"+
    "\6\0\1\67\6\0\1\66\2\0\2\13\1\67\36\0"+
    "\6\13\7\0\1\67\16\72\1\73\1\74\50\72\33\0"+
    "\1\75\35\0\3\76\1\0\3\77\1\0\3\77\1\0"+
    "\1\77\1\100\32\0\17\77\33\0\1\101\42\0\1\66"+
    "\2\0\2\13\1\67\17\0\1\102\16\0\6\13\7\0"+
    "\1\67\6\0\1\66\2\0\2\13\1\67\17\0\1\103"+
    "\16\0\6\13\7\0\1\67\6\0\1\66\2\0\2\13"+
    "\1\67\17\0\1\104\16\0\6\13\7\0\1\67\6\0"+
    "\1\66\2\0\2\13\1\67\17\0\1\105\16\0\6\13"+
    "\7\0\1\67\6\0\1\66\2\0\2\13\1\67\17\0"+
    "\1\106\16\0\6\13\7\0\1\67\6\0\1\66\2\0"+
    "\2\13\1\67\17\0\1\107\16\0\6\13\7\0\1\67"+
    "\5\0\3\6\1\0\3\6\1\0\1\6\33\0\10\6"+
    "\1\110\6\6\5\0\3\6\1\0\3\6\1\0\1\6"+
    "\33\0\12\6\1\111\4\6\5\0\3\6\1\0\3\6"+
    "\1\0\1\6\33\0\14\6\1\112\2\6\1\61\1\113"+
    "\1\114\65\61\5\0\3\63\1\0\3\63\1\0\1\63"+
    "\33\0\17\63\6\0\1\66\4\0\1\67\1\0\1\70"+
    "\33\0\1\70\6\0\1\70\6\0\1\67\11\0\2\115"+
    "\37\0\6\115\20\0\3\116\1\0\1\116\35\0\6\116"+
    "\10\0\16\72\1\117\1\74\50\72\1\0\3\76\71\0"+
    "\3\77\1\0\3\77\1\0\1\77\33\0\17\77\16\100"+
    "\1\120\1\121\50\100\5\0\3\6\1\0\3\6\1\0"+
    "\1\6\33\0\7\6\1\122\7\6\2\0\1\114\76\0"+
    "\2\115\1\67\36\0\6\115\7\0\1\67\11\0\2\116"+
    "\37\0\6\116\10\0\16\100\1\123\1\121\50\100\5\0"+
    "\3\6\1\0\3\6\1\0\1\6\33\0\15\6\1\124"+
    "\1\6\5\0\3\6\1\0\3\6\1\0\1\6\33\0"+
    "\16\6\1\125";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2184];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\3\1\1\11\4\1\1\11\3\1\5\11"+
    "\1\1\22\11\12\1\1\11\3\1\1\0\1\1\2\11"+
    "\1\0\1\11\1\0\1\11\2\1\1\0\7\11\4\1"+
    "\1\11\3\1\1\11\1\0\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  KLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch ((zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL-1] : zzBufferL.charAt(zzMarkedPosL-1))) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { return DOLLAR;
          }
        case 55: break;
        case 52: 
          { return IF;
          }
        case 56: break;
        case 19: 
          { return OPEN_PAREN;
          }
        case 57: break;
        case 11: 
          { return BACK_SLASH;
          }
        case 58: break;
        case 20: 
          { return CLOSE_PAREN;
          }
        case 59: break;
        case 36: 
          { return TILDE;
          }
        case 60: break;
        case 39: 
          { return SYSFUNCTION;
          }
        case 61: break;
        case 24: 
          { return SEMICOLON;
          }
        case 62: break;
        case 48: 
          { return THREECOLON;
          }
        case 63: break;
        case 44: 
          { return SYMBOL;
          }
        case 64: break;
        case 25: 
          { return LESS_THAN;
          }
        case 65: break;
        case 6: 
          { return UNDERSCORE;
          }
        case 66: break;
        case 51: 
          { return SIXCOLON;
          }
        case 67: break;
        case 8: 
          { return NUMBER;
          }
        case 68: break;
        case 18: 
          { return TICK;
          }
        case 69: break;
        case 49: 
          { return FOURCOLON;
          }
        case 70: break;
        case 12: 
          { return BACK_TICK;
          }
        case 71: break;
        case 43: 
          { return BACK_SLASH_COLON;
          }
        case 72: break;
        case 33: 
          { return OPEN_BRACE;
          }
        case 73: break;
        case 22: 
          { return COMMA;
          }
        case 74: break;
        case 35: 
          { return CLOSE_BRACE;
          }
        case 75: break;
        case 37: 
          { return COMMENT;
          }
        case 76: break;
        case 29: 
          { return AT;
          }
        case 77: break;
        case 14: 
          { return HASH;
          }
        case 78: break;
        case 30: 
          { return OPEN_BRACKET;
          }
        case 79: break;
        case 31: 
          { return CLOSE_BRACET;
          }
        case 80: break;
        case 23: 
          { return COLON;
          }
        case 81: break;
        case 26: 
          { return EQUALS;
          }
        case 82: break;
        case 7: 
          { return DASH;
          }
        case 83: break;
        case 45: 
          { return TICK_COLON;
          }
        case 84: break;
        case 17: 
          { return AMPERSAND;
          }
        case 85: break;
        case 3: 
          { return SLASH;
          }
        case 86: break;
        case 10: 
          { return QUOTE;
          }
        case 87: break;
        case 53: 
          { return DO;
          }
        case 88: break;
        case 16: 
          { return PERCENT;
          }
        case 89: break;
        case 54: 
          { return WHILE;
          }
        case 90: break;
        case 47: 
          { return TWOCOLON;
          }
        case 91: break;
        case 27: 
          { return GREATER_THAN;
          }
        case 92: break;
        case 40: 
          { return NIL;
          }
        case 93: break;
        case 50: 
          { return FIVECOLON;
          }
        case 94: break;
        case 42: 
          { return STRING;
          }
        case 95: break;
        case 34: 
          { return PIPE;
          }
        case 96: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 97: break;
        case 38: 
          { return SLASH_COLON;
          }
        case 98: break;
        case 21: 
          { return ASTERISK;
          }
        case 99: break;
        case 28: 
          { return QUESTION_MARK;
          }
        case 100: break;
        case 4: 
          { return IDENTIFIER;
          }
        case 101: break;
        case 46: 
          { return ONECOLON;
          }
        case 102: break;
        case 9: 
          { return PLUS;
          }
        case 103: break;
        case 13: 
          { return BANG;
          }
        case 104: break;
        case 5: 
          { return PERIOD;
          }
        case 105: break;
        case 32: 
          { return CARET;
          }
        case 106: break;
        case 41: 
          { return ZEROCOLON;
          }
        case 107: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 108: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
