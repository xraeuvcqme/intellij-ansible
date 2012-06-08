/* The following code was generated by JFlex 1.4.3 on 6/8/12 1:26 PM */

package cz.juzna.intellij.neon.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import cz.juzna.intellij.neon.lexer.NeonTokenTypes;

/**
 * @author Ondrej Brejla
 */

class _NeonLexer implements FlexLexer, NeonTokenTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ST_IN_RIGHT_BLOCK = 10;
  public static final int ST_VALUED_BLOCK = 6;
  public static final int ST_IN_ARRAY_KEY = 12;
  public static final int ST_IN_BLOCK = 2;
  public static final int ST_IN_ARRAY_VALUE = 14;
  public static final int ST_IN_INHERITED_BLOCK = 8;
  public static final int ST_IN_MINUS_ARRAY_VALUE = 16;
  public static final int ST_IN_PA_ARRAY = 22;
  public static final int ST_HIGHLIGHTING_ERROR = 24;
  public static final int ST_IN_SQ_ARRAY = 18;
  public static final int ST_BLOCK_HEADER = 4;
  public static final int YYINITIAL = 0;
  public static final int ST_IN_CU_ARRAY = 20;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     5,  5,  8,  8,  9,  9, 10, 10, 11, 11
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\32\1\34\2\0\1\33\22\0\1\32\1\3\1\52\1\61"+
    "\1\0\1\55\1\0\1\54\1\65\1\47\1\0\1\36\1\51\1\50"+
    "\1\43\1\0\1\35\7\40\2\37\1\56\1\0\1\60\1\57\1\44"+
    "\1\0\1\62\1\21\3\42\1\13\1\20\5\1\1\22\1\1\1\30"+
    "\1\31\2\1\1\11\1\23\1\10\1\12\2\1\1\41\1\25\1\1"+
    "\1\63\1\53\1\45\1\0\1\1\1\0\1\15\3\42\1\7\1\14"+
    "\5\1\1\16\1\1\1\26\1\27\2\1\1\5\1\17\1\4\1\6"+
    "\2\1\1\41\1\24\1\1\1\64\1\0\1\46\1\0\67\1\4\0"+
    "\1\1\5\0\27\1\1\0\37\1\1\0\u013f\1\31\0\162\1\4\0"+
    "\14\1\16\0\5\1\11\0\1\1\213\0\1\1\13\0\1\1\1\0"+
    "\3\1\1\0\1\1\1\0\24\1\1\0\54\1\1\0\46\1\1\0"+
    "\5\1\4\0\202\1\10\0\105\1\1\0\46\1\2\0\2\1\6\0"+
    "\20\1\41\0\46\1\2\0\1\1\7\0\47\1\110\0\33\1\5\0"+
    "\3\1\56\0\32\1\5\0\13\1\25\0\12\2\4\0\2\1\1\0"+
    "\143\1\1\0\1\1\17\0\2\1\7\0\2\1\12\2\3\1\2\0"+
    "\1\1\20\0\1\1\1\0\36\1\35\0\3\1\60\0\46\1\13\0"+
    "\1\1\u0152\0\66\1\3\0\1\1\22\0\1\1\7\0\12\1\4\0"+
    "\12\2\25\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0"+
    "\1\1\3\0\4\1\3\0\1\1\36\0\2\1\1\0\3\1\4\0"+
    "\12\2\2\1\23\0\6\1\4\0\2\1\2\0\26\1\1\0\7\1"+
    "\1\0\2\1\1\0\2\1\1\0\2\1\37\0\4\1\1\0\1\1"+
    "\7\0\12\2\2\0\3\1\20\0\11\1\1\0\3\1\1\0\26\1"+
    "\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1\22\0\1\1"+
    "\17\0\2\1\4\0\12\2\25\0\10\1\2\0\2\1\2\0\26\1"+
    "\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1\36\0\2\1"+
    "\1\0\3\1\4\0\12\2\1\0\1\1\21\0\1\1\1\0\6\1"+
    "\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0\2\1"+
    "\3\0\2\1\3\0\3\1\3\0\10\1\1\0\3\1\55\0\11\2"+
    "\25\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1"+
    "\46\0\2\1\4\0\12\2\25\0\10\1\1\0\3\1\1\0\27\1"+
    "\1\0\12\1\1\0\5\1\3\0\1\1\40\0\1\1\1\0\2\1"+
    "\4\0\12\2\25\0\10\1\1\0\3\1\1\0\27\1\1\0\20\1"+
    "\46\0\2\1\4\0\12\2\25\0\22\1\3\0\30\1\1\0\11\1"+
    "\1\0\1\1\2\0\7\1\72\0\60\1\1\0\2\1\14\0\7\1"+
    "\11\0\12\2\47\0\2\1\1\0\1\1\2\0\2\1\1\0\1\1"+
    "\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1\1\0\1\1"+
    "\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1\11\0\1\1"+
    "\2\0\5\1\1\0\1\1\11\0\12\2\2\0\2\1\42\0\1\1"+
    "\37\0\12\2\26\0\10\1\1\0\42\1\35\0\4\1\164\0\42\1"+
    "\1\0\5\1\1\0\2\1\25\0\12\2\6\0\6\1\112\0\46\1"+
    "\12\0\51\1\7\0\132\1\5\0\104\1\5\0\122\1\6\0\7\1"+
    "\1\0\77\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1"+
    "\1\0\4\1\2\0\47\1\1\0\1\1\1\0\4\1\2\0\37\1"+
    "\1\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1"+
    "\2\0\7\1\1\0\7\1\1\0\27\1\1\0\37\1\1\0\1\1"+
    "\1\0\4\1\2\0\7\1\1\0\47\1\1\0\23\1\16\0\11\2"+
    "\56\0\125\1\14\0\u026c\1\2\0\10\1\12\0\32\1\5\0\113\1"+
    "\25\0\15\1\1\0\4\1\16\0\22\1\16\0\22\1\16\0\15\1"+
    "\1\0\3\1\17\0\64\1\43\0\1\1\4\0\1\1\3\0\12\2"+
    "\46\0\12\2\6\0\130\1\10\0\51\1\127\0\35\1\51\0\12\2"+
    "\36\1\2\0\5\1\u038b\0\154\1\224\0\234\1\4\0\132\1\6\0"+
    "\26\1\2\0\6\1\2\0\46\1\2\0\6\1\2\0\10\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\37\1\2\0\65\1\1\0"+
    "\7\1\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0"+
    "\6\1\4\0\15\1\5\0\3\1\1\0\7\1\164\0\1\1\15\0"+
    "\1\1\202\0\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0"+
    "\5\1\6\0\1\1\1\0\1\1\1\0\1\1\1\0\4\1\1\0"+
    "\3\1\1\0\7\1\3\0\3\1\5\0\5\1\u0ebb\0\2\1\52\0"+
    "\5\1\5\0\2\1\4\0\126\1\6\0\3\1\1\0\132\1\1\0"+
    "\4\1\5\0\50\1\4\0\136\1\21\0\30\1\70\0\20\1\u0200\0"+
    "\u19b6\1\112\0\u51a6\1\132\0\u048d\1\u0773\0\u2ba4\1\u215c\0\u012e\1\2\0"+
    "\73\1\225\0\7\1\14\0\5\1\5\0\1\1\1\0\12\1\1\0"+
    "\15\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\154\1\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0\14\1\164\0"+
    "\5\1\1\0\207\1\23\0\12\2\7\0\32\1\6\0\32\1\13\0"+
    "\131\1\3\0\6\1\2\0\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\14\0\3\1\2\2\1\3\2\4\1\5\1\6\1\7"+
    "\1\10\2\11\1\7\1\12\1\13\2\7\2\14\11\15"+
    "\2\16\1\17\1\15\1\17\1\15\4\7\1\20\1\21"+
    "\1\22\1\7\1\23\1\24\1\3\1\25\4\7\1\26"+
    "\1\14\1\26\4\0\1\10\1\27\1\13\4\0\7\15"+
    "\1\30\2\15\1\17\2\15\2\17\1\0\1\31\3\0"+
    "\1\32\2\33\1\24\2\34\1\24\10\0\3\24\3\35"+
    "\1\0\2\13\7\15\1\17\2\31\1\32\1\24\2\0"+
    "\4\24\1\0\2\24\2\34";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u0288"+
    "\0\u032a\0\u02be\0\u0360\0\u0288\0\u0288\0\u0396\0\u0288\0\u03cc"+
    "\0\u0402\0\u0288\0\u0438\0\u0288\0\u046e\0\u04a4\0\u04da\0\u0510"+
    "\0\u0288\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654\0\u068a"+
    "\0\u06c0\0\u06f6\0\u072c\0\u0288\0\u0762\0\u0798\0\u07ce\0\u0804"+
    "\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0288\0\u0288\0\u0288\0\u0912"+
    "\0\u0288\0\u0948\0\u097e\0\u0288\0\u09b4\0\u09ea\0\u0a20\0\u0a56"+
    "\0\u0288\0\u0a8c\0\u0ac2\0\u032a\0\u0af8\0\u0b2e\0\u0b64\0\u0288"+
    "\0\u0438\0\u0288\0\u04a4\0\u0b9a\0\u04da\0\u0bd0\0\u0c06\0\u0c3c"+
    "\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0546\0\u0d80\0\u0db6"+
    "\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\u083a\0\u0288\0\u0efa"+
    "\0\u0870\0\u0f30\0\u0f66\0\u0f9c\0\u08dc\0\u0fd2\0\u0948\0\u0288"+
    "\0\u1008\0\u103e\0\u1074\0\u0a20\0\u10aa\0\u09b4\0\u10e0\0\u09ea"+
    "\0\u1116\0\u114c\0\u1182\0\u11b8\0\u11ee\0\u0288\0\u1224\0\u125a"+
    "\0\u04a4\0\u04da\0\u1290\0\u12c6\0\u12fc\0\u1332\0\u1368\0\u139e"+
    "\0\u0ec4\0\u0e58\0\u083a\0\u0870\0\u0288\0\u13d4\0\u140a\0\u1440"+
    "\0\u1476\0\u14ac\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u09b4"+
    "\0\u09ea";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
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
    "\32\15\1\16\1\17\32\15\1\20\1\21\2\20\26\21"+
    "\1\22\1\23\1\24\4\20\2\21\13\20\2\25\1\20"+
    "\1\26\4\20\1\27\1\30\2\27\26\30\1\22\1\31"+
    "\1\32\4\27\2\30\5\27\1\33\5\27\2\32\1\34"+
    "\1\26\5\27\1\35\2\27\26\35\1\22\1\31\1\32"+
    "\4\27\2\35\5\27\1\33\1\27\1\36\1\27\1\37"+
    "\1\27\2\32\1\34\1\26\5\27\1\30\2\27\26\30"+
    "\1\22\1\40\1\41\4\27\2\30\13\27\2\32\1\27"+
    "\1\26\4\27\4\42\1\43\3\42\1\44\3\42\1\45"+
    "\3\42\1\46\3\42\1\47\1\50\1\51\1\42\1\52"+
    "\1\42\1\22\1\53\1\54\1\55\1\56\2\57\2\42"+
    "\1\60\4\27\1\56\1\27\1\61\1\42\1\62\1\63"+
    "\1\42\2\27\1\26\1\64\1\65\1\66\1\67\32\42"+
    "\1\22\1\70\1\27\1\55\1\56\2\57\2\42\1\60"+
    "\4\27\1\56\1\27\1\61\1\42\1\62\1\27\1\42"+
    "\1\71\1\27\1\26\1\64\3\27\4\42\1\43\3\42"+
    "\1\44\3\42\1\45\3\42\1\46\3\42\1\47\1\50"+
    "\1\51\1\42\1\52\1\42\1\22\1\70\1\27\1\55"+
    "\1\56\2\57\2\42\1\60\1\27\3\32\1\56\1\32"+
    "\1\61\1\42\1\62\1\63\1\42\2\27\1\26\1\64"+
    "\1\65\1\66\1\67\32\72\1\73\1\70\1\27\7\72"+
    "\1\27\1\71\2\27\1\72\1\74\1\75\1\72\1\76"+
    "\1\77\1\72\2\27\1\26\1\100\3\27\32\72\1\73"+
    "\1\70\1\27\7\72\2\27\1\71\1\27\1\72\1\74"+
    "\1\75\1\72\1\76\1\77\1\72\2\27\1\26\1\100"+
    "\3\27\32\72\1\73\1\70\1\27\7\72\3\27\1\71"+
    "\1\72\1\74\1\75\1\72\1\76\1\77\1\72\2\27"+
    "\1\26\1\100\3\27\32\101\1\102\1\103\32\101\120\0"+
    "\1\22\67\0\1\15\32\0\2\104\1\105\26\104\1\105"+
    "\2\0\1\104\1\0\5\104\12\0\1\106\1\0\1\107"+
    "\41\0\1\24\31\0\33\26\2\0\12\26\1\0\16\26"+
    "\1\0\2\30\1\110\26\30\3\0\1\30\1\0\5\30"+
    "\56\0\1\32\63\0\1\111\34\0\2\35\1\112\26\35"+
    "\3\0\1\35\1\0\5\35\22\0\33\113\2\0\15\113"+
    "\1\112\1\114\12\113\33\115\2\0\16\115\1\116\1\112"+
    "\11\115\34\0\1\41\31\0\32\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\5\42\1\117"+
    "\24\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\11\42\1\120\20\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\15\42\1\121"+
    "\14\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\21\42\1\122\10\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\7\42\1\123"+
    "\22\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\13\42\1\124\16\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\6\42\1\125"+
    "\20\42\1\126\2\42\3\0\7\42\4\0\1\42\2\0"+
    "\1\42\2\0\1\42\7\0\12\42\1\127\16\42\1\126"+
    "\3\0\7\42\4\0\1\42\2\0\1\42\2\0\1\42"+
    "\43\0\1\54\31\0\7\42\1\130\3\42\1\130\16\42"+
    "\3\0\1\131\1\42\1\132\1\131\1\133\1\42\1\134"+
    "\4\0\1\42\2\0\1\42\2\0\1\42\7\0\32\42"+
    "\3\0\2\42\2\135\3\42\4\0\1\42\2\0\1\42"+
    "\2\0\1\42\7\0\7\42\1\130\3\42\1\130\16\42"+
    "\3\0\1\57\1\42\2\57\2\42\1\134\4\0\1\42"+
    "\2\0\1\42\2\0\1\42\7\0\32\42\3\0\1\134"+
    "\1\42\2\134\3\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\33\136\2\0\15\136\1\137\1\140\12\136"+
    "\33\141\2\0\16\141\1\142\1\137\11\141\32\143\3\0"+
    "\7\143\4\0\1\143\2\0\1\143\2\0\1\143\10\0"+
    "\1\144\2\0\26\144\7\0\2\144\10\0\1\145\46\0"+
    "\1\27\31\0\32\72\1\146\2\0\7\72\4\0\1\72"+
    "\2\0\1\72\2\0\1\147\1\150\6\0\32\151\1\73"+
    "\2\0\7\151\4\0\1\151\1\0\1\152\1\151\1\153"+
    "\1\154\1\151\3\0\1\155\3\0\33\156\2\0\15\156"+
    "\1\146\1\157\12\156\33\160\2\0\16\160\1\161\1\146"+
    "\11\160\32\162\3\0\7\162\4\0\1\162\2\0\1\162"+
    "\2\0\1\162\10\0\1\163\2\0\26\163\7\0\2\163"+
    "\10\0\1\164\44\0\1\102\67\0\1\101\63\0\1\105"+
    "\23\0\1\106\1\0\1\107\37\0\1\106\1\165\1\166"+
    "\24\0\1\167\5\0\1\170\2\0\26\170\1\107\6\0"+
    "\2\170\23\0\33\113\2\0\15\113\1\171\1\114\12\113"+
    "\33\115\2\0\16\115\1\116\1\172\11\115\6\42\1\173"+
    "\23\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\12\42\1\174\17\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\16\42\1\175"+
    "\13\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\22\42\1\176\7\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\17\42\1\126"+
    "\12\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\23\42\1\126\6\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\16\42\1\177"+
    "\13\42\3\0\7\42\4\0\1\42\2\0\1\42\2\0"+
    "\1\42\7\0\22\42\1\200\7\42\3\0\7\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\32\42\3\0"+
    "\1\135\1\201\2\135\3\42\4\0\1\201\2\0\1\42"+
    "\2\0\1\42\7\0\7\42\1\130\3\42\1\130\16\42"+
    "\3\0\1\131\1\42\1\132\1\131\2\42\1\134\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\7\42\1\130"+
    "\3\42\1\130\16\42\3\0\1\132\1\42\2\132\2\42"+
    "\1\134\4\0\1\42\2\0\1\42\2\0\1\42\7\0"+
    "\7\42\1\202\3\42\3\202\2\42\2\202\10\42\3\0"+
    "\1\202\1\42\2\202\1\42\1\202\1\42\4\0\1\42"+
    "\2\0\1\42\2\0\1\42\7\0\7\42\1\130\3\42"+
    "\1\130\16\42\3\0\1\134\1\42\2\134\3\42\4\0"+
    "\1\42\2\0\1\42\2\0\1\42\7\0\32\42\3\0"+
    "\1\135\1\42\2\135\3\42\4\0\1\42\2\0\1\42"+
    "\2\0\1\42\7\0\33\136\2\0\15\136\1\203\1\140"+
    "\12\136\33\141\2\0\16\141\1\142\1\204\11\141\32\143"+
    "\3\0\7\143\4\0\1\143\2\0\1\143\1\0\1\205"+
    "\1\143\10\0\2\144\1\145\26\144\3\0\1\144\1\0"+
    "\5\144\7\0\1\145\44\0\1\146\23\0\2\150\6\0"+
    "\32\151\1\206\2\0\7\151\4\0\1\151\2\0\1\151"+
    "\2\0\1\151\7\0\33\152\2\0\15\152\1\206\1\207"+
    "\12\152\33\153\2\0\16\153\1\210\1\206\11\153\1\0"+
    "\1\211\2\0\26\211\7\0\2\211\10\0\1\212\12\0"+
    "\33\156\2\0\15\156\1\213\1\157\12\156\33\160\2\0"+
    "\16\160\1\161\1\214\11\160\32\162\1\206\2\0\7\162"+
    "\4\0\1\162\2\0\1\162\1\0\1\206\1\162\10\0"+
    "\2\163\1\164\26\163\1\146\2\0\1\163\1\0\5\163"+
    "\7\0\1\164\2\0\2\150\7\0\1\163\2\0\26\163"+
    "\1\146\6\0\2\163\10\0\1\164\2\0\2\150\42\0"+
    "\1\166\31\0\33\167\2\0\12\167\1\0\16\167\1\0"+
    "\2\170\1\215\26\170\1\215\2\0\1\170\1\0\5\170"+
    "\12\0\1\106\7\0\7\42\1\126\22\42\3\0\7\42"+
    "\4\0\1\42\2\0\1\42\2\0\1\42\7\0\13\42"+
    "\1\126\16\42\3\0\7\42\4\0\1\42\2\0\1\42"+
    "\2\0\1\42\7\0\17\42\1\173\12\42\3\0\7\42"+
    "\4\0\1\42\2\0\1\42\2\0\1\42\7\0\23\42"+
    "\1\174\6\42\3\0\7\42\4\0\1\42\2\0\1\42"+
    "\2\0\1\42\7\0\16\42\1\126\13\42\3\0\7\42"+
    "\4\0\1\42\2\0\1\42\2\0\1\42\7\0\22\42"+
    "\1\126\7\42\3\0\7\42\4\0\1\42\2\0\1\42"+
    "\2\0\1\42\41\0\1\206\33\0\33\152\2\0\15\152"+
    "\1\216\1\207\12\152\33\153\2\0\16\153\1\210\1\217"+
    "\11\153\1\0\2\211\1\212\26\211\1\206\2\0\1\211"+
    "\1\0\5\211\7\0\1\212\13\0\1\211\2\0\26\211"+
    "\1\206\6\0\2\211\10\0\1\212\12\0\32\156\1\213"+
    "\2\0\15\156\1\146\1\157\2\156\2\220\6\156\32\160"+
    "\1\214\2\0\16\160\1\161\1\146\1\160\2\221\6\160"+
    "\32\0\1\215\23\0\1\106\7\0\32\152\1\216\2\0"+
    "\15\152\1\206\1\207\12\152\32\153\1\217\2\0\16\153"+
    "\1\210\1\206\11\153";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5616];
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
    "\14\0\1\11\2\1\1\11\3\1\2\11\1\1\1\11"+
    "\2\1\1\11\1\1\1\11\4\1\1\11\12\1\1\11"+
    "\10\1\3\11\1\1\1\11\2\1\1\11\4\1\1\11"+
    "\2\1\4\0\1\11\1\1\1\11\4\0\17\1\1\0"+
    "\1\11\3\0\5\1\1\11\1\1\10\0\4\1\1\11"+
    "\1\1\1\0\14\1\1\11\1\1\2\0\4\1\1\0"+
    "\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
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

  /* user code: */
    private StateStack stack = new StateStack();

    public _NeonLexer() {
        zzState = zzLexicalState = YYINITIAL;
        stack.clear();
    }

    public static final class LexerState  {
        final StateStack stack;
        /** the current state of the DFA */
        final int zzState;
        /** the current lexical state */
        final int zzLexicalState;

        LexerState(StateStack stack, int zzState, int zzLexicalState) {
            this.stack = stack;
            this.zzState = zzState;
            this.zzLexicalState = zzLexicalState;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            LexerState state = (LexerState) obj;
            return (this.stack.equals(state.stack)
                && (this.zzState == state.zzState)
                && (this.zzLexicalState == state.zzLexicalState));
        }

        @Override
        public int hashCode() {
            int hash = 11;
            hash = 31 * hash + this.zzState;
            hash = 31 * hash + this.zzLexicalState;
            if (stack != null) {
                hash = 31 * hash + this.stack.hashCode();
            }
            return hash;
        }
    }

    public LexerState getState() {
        return new LexerState(stack.createClone(), zzState, zzLexicalState);
    }

    public void setState(LexerState state) {
        this.stack.copyFrom(state.stack);
        this.zzState = state.zzState;
        this.zzLexicalState = state.zzLexicalState;
    }

    protected int getZZLexicalState() {
        return zzLexicalState;
    }

    protected void popState() {
		yybegin(stack.popStack());
	}

	protected void pushState(final int state) {
		stack.pushStack(getZZLexicalState());
		yybegin(state);
	}


  _NeonLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _NeonLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
    while (i < 1320) {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
        case 22: 
          { return NEON_UNKNOWN;
          }
        case 30: break;
        case 2: 
          { pushState(ST_VALUED_BLOCK);
        yypushback(yylength());
          }
        case 31: break;
        case 13: 
          { return NEON_LITERAL;
          }
        case 32: break;
        case 6: 
          { return NEON_COMMENT;
          }
        case 33: break;
        case 18: 
          { pushState(ST_IN_PA_ARRAY);
        return NEON_INTERPUNCTION;
          }
        case 34: break;
        case 19: 
          { popState();
        return NEON_INTERPUNCTION;
          }
        case 35: break;
        case 1: 
          { yypushback(yylength());
    pushState(ST_IN_BLOCK);
          }
        case 36: break;
        case 8: 
          { return NEON_BLOCK;
          }
        case 37: break;
        case 7: 
          { yypushback(yylength());
        pushState(ST_HIGHLIGHTING_ERROR);
          }
        case 38: break;
        case 26: 
          { return NEON_VARIABLE;
          }
        case 39: break;
        case 5: 
          { pushState(ST_IN_RIGHT_BLOCK);
        return NEON_INTERPUNCTION;
          }
        case 40: break;
        case 29: 
          { pushState(ST_BLOCK_HEADER);
        yypushback(yylength());
          }
        case 41: break;
        case 11: 
          { return NEON_VALUED_BLOCK;
          }
        case 42: break;
        case 28: 
          { pushState(ST_IN_ARRAY_KEY);
        yypushback(yylength());
          }
        case 43: break;
        case 12: 
          { popState();
        return NEON_WHITESPACE;
          }
        case 44: break;
        case 4: 
          { return NEON_EOL;
          }
        case 45: break;
        case 23: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { pushState(ST_IN_MINUS_ARRAY_VALUE);
        return NEON_INTERPUNCTION;
          }
        case 46: break;
        case 10: 
          { pushState(ST_IN_INHERITED_BLOCK);
        return NEON_INTERPUNCTION;
          }
        case 47: break;
        case 14: 
          { yypushback(yylength());
        popState();
          }
        case 48: break;
        case 27: 
          { return NEON_REFERENCE;
          }
        case 49: break;
        case 9: 
          { popState();
        yypushback(yylength());
          }
        case 50: break;
        case 25: 
          { return NEON_STRING;
          }
        case 51: break;
        case 17: 
          { pushState(ST_IN_CU_ARRAY);
        return NEON_INTERPUNCTION;
          }
        case 52: break;
        case 16: 
          { pushState(ST_IN_SQ_ARRAY);
        return NEON_INTERPUNCTION;
          }
        case 53: break;
        case 20: 
          { pushState(ST_IN_ARRAY_VALUE);
        yypushback(yylength());
          }
        case 54: break;
        case 24: 
          { return NEON_KEYWORD;
          }
        case 55: break;
        case 15: 
          { return NEON_NUMBER;
          }
        case 56: break;
        case 21: 
          { return NEON_INTERPUNCTION;
          }
        case 57: break;
        case 3: 
          { return NEON_WHITESPACE;
          }
        case 58: break;
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
