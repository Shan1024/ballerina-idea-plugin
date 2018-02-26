/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.simpleplugin.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.simpleplugin.psi.SimpleTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_SimpleLexer.flex</tt>
 */
public class _SimpleLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

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
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\5\1\22\0\1\1\1\55\3\0\1\54\1\60\1\0\1\43\1\44\1\52\1\50\1\40\1\51\1"+
    "\37\1\4\12\3\1\0\1\35\1\57\1\36\1\56\1\47\1\62\1\2\1\73\2\2\1\65\3\2\1\70"+
    "\2\2\1\74\1\2\1\72\1\71\2\2\1\66\1\67\2\2\1\64\4\2\1\45\1\0\1\46\1\53\1\2"+
    "\1\63\1\6\1\22\1\7\1\30\1\12\1\26\1\11\1\34\1\13\1\32\1\10\1\23\1\14\1\25"+
    "\1\15\1\5\1\2\1\16\1\20\1\17\1\21\1\24\1\27\1\31\1\33\1\2\1\41\1\61\1\42\7"+
    "\0\1\1\32\0\1\1\337\0\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\21\3\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\2\1\1\31\1\32\1\3\6\0\1\33"+
    "\11\0\1\34\1\35\36\0\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\7\0\1\47\1\0"+
    "\1\50\7\0\1\51\1\52\5\0\1\53\13\0\1\54"+
    "\12\0\1\55\16\0\1\56\1\57\10\0\1\60\2\0"+
    "\1\61\2\0\1\62\2\0\1\63\1\0\1\64\1\0"+
    "\1\65\2\0\1\66\3\0\1\67\5\0\1\70\1\71"+
    "\6\0\1\72\1\0\1\73\1\74\7\0\1\75\3\0"+
    "\1\76\4\0\1\77\6\0\1\100\1\0\1\101\1\102"+
    "\5\0\1\103\1\104\1\105\2\0\1\106\1\0\1\107"+
    "\1\0\1\110\4\0\1\111\1\0\1\112\1\113\2\0"+
    "\1\114\1\115\3\0\1\116\3\0\1\117\1\120\3\0"+
    "\1\121\1\122\1\0\1\123\2\0\1\124\1\0\1\125"+
    "\1\0\1\126\1\127\3\0\1\130\2\0\1\131\1\132"+
    "\3\0\1\133\1\134\3\0\1\135\5\0\1\136\2\0"+
    "\1\137\2\0\1\140\1\141\3\0\1\142\3\0\1\143";

  private static int [] zzUnpackAction() {
    int [] result = new int[330];
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
    "\0\0\0\75\0\172\0\75\0\75\0\267\0\364\0\u0131"+
    "\0\u016e\0\u01ab\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319"+
    "\0\u0356\0\u0393\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4\0\75"+
    "\0\u0501\0\u053e\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\75\0\75\0\u057b\0\75\0\75\0\75\0\u05b8"+
    "\0\u05f5\0\u0632\0\u066f\0\u06ac\0\75\0\75\0\u06e9\0\75"+
    "\0\u0726\0\u0763\0\u07a0\0\u07dd\0\u081a\0\75\0\u0857\0\u0894"+
    "\0\u08d1\0\u090e\0\u094b\0\u0988\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c"+
    "\0\75\0\u0ab9\0\u0af6\0\u0b33\0\u0b70\0\u0bad\0\u0bea\0\u0c27"+
    "\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\u0fba\0\u0ff7"+
    "\0\u1034\0\u1071\0\u10ae\0\u10eb\0\u1128\0\u1165\0\u11a2\0\75"+
    "\0\75\0\75\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\u11df\0\u121c\0\u1259\0\u1296\0\u12d3\0\u1310\0\u134d\0\75"+
    "\0\u138a\0\75\0\u13c7\0\u1404\0\u1441\0\u147e\0\u14bb\0\u14f8"+
    "\0\u1535\0\75\0\75\0\u1572\0\u15af\0\u15ec\0\u1629\0\u1666"+
    "\0\75\0\u16a3\0\u16e0\0\u171d\0\u175a\0\u1797\0\u17d4\0\u1811"+
    "\0\u184e\0\u188b\0\u18c8\0\u1905\0\75\0\u1942\0\u197f\0\u19bc"+
    "\0\u19f9\0\u1a36\0\u1a73\0\u1ab0\0\u1aed\0\u1b2a\0\u1b67\0\u1ba4"+
    "\0\u1be1\0\u1c1e\0\u1c5b\0\u1c98\0\u1cd5\0\u1d12\0\u1d4f\0\u1d8c"+
    "\0\u1dc9\0\u1e06\0\u1e43\0\u1e80\0\u1ebd\0\u1efa\0\75\0\75"+
    "\0\u1f37\0\u1f74\0\u1fb1\0\u1fee\0\u202b\0\u2068\0\u20a5\0\u20e2"+
    "\0\u211f\0\u215c\0\u2199\0\75\0\u21d6\0\u2213\0\75\0\u2250"+
    "\0\u228d\0\75\0\u22ca\0\75\0\u2307\0\75\0\u2344\0\u2381"+
    "\0\75\0\u23be\0\u23fb\0\u2438\0\75\0\u2475\0\u24b2\0\u24ef"+
    "\0\u252c\0\u2569\0\75\0\75\0\u25a6\0\u25e3\0\u2620\0\u265d"+
    "\0\u269a\0\u26d7\0\75\0\u2714\0\75\0\75\0\u2751\0\u278e"+
    "\0\u27cb\0\u2808\0\u2845\0\u2882\0\u28bf\0\75\0\u28fc\0\u2939"+
    "\0\u2976\0\75\0\u29b3\0\u29f0\0\u2a2d\0\u2a6a\0\75\0\u2aa7"+
    "\0\u2ae4\0\u2b21\0\u2b5e\0\u2b9b\0\u2bd8\0\75\0\u2c15\0\75"+
    "\0\75\0\u2c52\0\u2c8f\0\u2ccc\0\u2d09\0\u2d46\0\75\0\75"+
    "\0\75\0\u2d83\0\u2dc0\0\75\0\u2dfd\0\75\0\u2e3a\0\u2e77"+
    "\0\u2eb4\0\u2ef1\0\u2f2e\0\u2f6b\0\75\0\u2fa8\0\75\0\u2fe5"+
    "\0\u3022\0\u305f\0\75\0\75\0\u309c\0\u30d9\0\u3116\0\75"+
    "\0\u3153\0\u3190\0\u31cd\0\75\0\75\0\u320a\0\u3247\0\u3284"+
    "\0\75\0\75\0\u32c1\0\75\0\u32fe\0\u333b\0\75\0\u3378"+
    "\0\75\0\u33b5\0\75\0\75\0\u33f2\0\u342f\0\u346c\0\75"+
    "\0\u34a9\0\u34e6\0\75\0\75\0\u3523\0\u3560\0\u359d\0\75"+
    "\0\75\0\u35da\0\u3617\0\u3654\0\75\0\u3691\0\u36ce\0\u370b"+
    "\0\u3748\0\u3785\0\75\0\u37c2\0\u37ff\0\75\0\u383c\0\u3879"+
    "\0\75\0\75\0\u38b6\0\u38f3\0\u3930\0\75\0\u396d\0\u39aa"+
    "\0\u39e7\0\75";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[330];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\2\4\1\12\1\13\1\14\1\4\1\15\1\16\1\17"+
    "\1\4\1\20\1\21\1\22\1\23\1\24\1\25\1\4"+
    "\1\26\1\27\2\4\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\10\4\76\0\1\3\77\0\1\60"+
    "\76\0\1\61\7\0\1\62\2\0\1\63\62\0\1\64"+
    "\7\0\1\65\1\66\1\0\1\67\1\70\1\0\1\71"+
    "\55\0\1\72\6\0\1\73\1\74\101\0\1\75\1\0"+
    "\1\76\63\0\1\77\10\0\1\100\1\101\54\0\1\102"+
    "\100\0\1\103\70\0\1\104\4\0\1\105\2\0\1\106"+
    "\14\0\1\107\1\110\52\0\1\111\2\0\1\112\1\0"+
    "\1\113\70\0\1\114\1\0\1\115\1\116\4\0\1\117"+
    "\63\0\1\120\2\0\1\121\65\0\1\122\74\0\1\123"+
    "\3\0\1\124\70\0\1\125\4\0\1\126\1\0\1\127"+
    "\3\0\1\130\1\0\1\131\64\0\1\132\1\0\1\133"+
    "\16\0\1\134\54\0\1\135\75\0\1\136\2\0\1\137"+
    "\112\0\1\140\75\0\1\141\113\0\1\142\54\0\1\143"+
    "\74\0\1\144\74\0\1\145\12\0\1\146\103\0\1\147"+
    "\75\0\1\150\100\0\1\151\16\0\1\152\100\0\1\153"+
    "\103\0\1\154\71\0\1\155\74\0\1\156\72\0\1\157"+
    "\102\0\1\160\76\0\1\161\5\0\1\162\60\0\1\163"+
    "\102\0\1\164\61\0\1\165\102\0\1\166\75\0\1\167"+
    "\6\0\1\170\51\0\1\171\106\0\1\172\62\0\1\173"+
    "\106\0\1\174\1\175\76\0\1\176\66\0\1\177\66\0"+
    "\1\200\24\0\1\201\46\0\1\202\105\0\1\203\74\0"+
    "\1\204\72\0\1\205\76\0\1\206\103\0\1\207\64\0"+
    "\1\210\71\0\1\211\77\0\1\212\104\0\1\213\56\0"+
    "\1\214\103\0\1\215\75\0\1\216\106\0\1\217\56\0"+
    "\1\220\106\0\1\221\65\0\1\222\103\0\1\223\64\0"+
    "\1\224\76\0\1\225\73\0\1\226\71\0\1\227\104\0"+
    "\1\230\64\0\1\231\76\0\1\232\145\0\1\233\16\0"+
    "\1\234\110\0\1\235\73\0\1\236\64\0\1\237\67\0"+
    "\1\240\104\0\1\241\73\0\1\242\66\0\1\243\105\0"+
    "\1\244\4\0\1\245\55\0\1\246\100\0\1\247\76\0"+
    "\1\250\65\0\1\251\104\0\1\252\75\0\1\253\2\0"+
    "\1\254\70\0\1\255\102\0\1\256\63\0\1\257\107\0"+
    "\1\260\61\0\1\261\77\0\1\262\103\0\1\263\62\0"+
    "\1\264\75\0\1\265\5\0\1\266\103\0\1\267\67\0"+
    "\1\270\57\0\1\271\110\0\1\272\63\0\1\273\73\0"+
    "\1\274\77\0\1\275\100\0\1\276\100\0\1\277\57\0"+
    "\1\300\76\0\1\301\1\0\1\302\71\0\1\303\73\0"+
    "\1\304\122\0\1\305\50\0\1\306\107\0\1\307\76\0"+
    "\1\310\44\0\1\311\1\0\1\312\25\0\1\313\74\0"+
    "\1\314\136\0\1\315\13\0\1\316\74\0\1\317\101\0"+
    "\1\320\76\0\1\321\66\0\1\322\104\0\1\323\74\0"+
    "\1\324\111\0\1\325\57\0\1\326\67\0\1\327\101\0"+
    "\1\330\72\0\1\331\75\0\1\332\71\0\1\333\77\0"+
    "\1\334\77\0\1\335\65\0\1\336\77\0\1\337\77\0"+
    "\1\340\71\0\1\341\106\0\1\342\60\0\1\343\106\0"+
    "\1\344\56\0\1\345\77\0\1\346\72\0\1\347\103\0"+
    "\1\350\101\0\1\351\62\0\1\352\105\0\1\353\57\0"+
    "\1\354\105\0\1\355\74\0\1\356\67\0\1\357\74\0"+
    "\1\360\102\0\1\361\62\0\1\362\103\0\1\363\147\0"+
    "\1\364\15\0\1\365\102\0\1\366\64\0\1\367\112\0"+
    "\1\370\103\0\1\371\46\0\1\372\75\0\1\373\77\0"+
    "\1\374\75\0\1\375\100\0\1\376\67\0\1\377\107\0"+
    "\1\u0100\65\0\1\u0101\77\0\1\u0102\61\0\1\u0103\17\0"+
    "\1\u0104\74\0\1\u0105\55\0\1\u0106\76\0\1\u0107\102\0"+
    "\1\u0108\63\0\1\u0109\122\0\1\u010a\52\0\1\u010b\112\0"+
    "\1\u010c\67\0\1\u010d\60\0\1\u010e\100\0\1\u010f\77\0"+
    "\1\u0110\72\0\1\u0111\67\0\1\u0112\156\0\1\u0113\15\0"+
    "\1\u0114\74\0\1\u0115\101\0\1\u0116\74\0\1\u0117\102\0"+
    "\1\u0118\67\0\1\u0119\74\0\1\u011a\63\0\1\u011b\104\0"+
    "\1\u011c\64\0\1\u011d\102\0\1\u011e\71\0\1\u011f\155\0"+
    "\1\u0120\26\0\1\u0121\64\0\1\u0122\112\0\1\u0123\75\0"+
    "\1\u0124\55\0\1\u0125\71\0\1\u0126\70\0\1\u0127\160\0"+
    "\1\u0128\15\0\1\u0129\76\0\1\u012a\76\0\1\u012b\67\0"+
    "\1\u012c\101\0\1\u012d\73\0\1\u012e\73\0\1\u012f\105\0"+
    "\1\u0130\73\0\1\u0131\67\0\1\u0132\77\0\1\u0133\66\0"+
    "\1\u0134\75\0\1\u0135\71\0\1\u0136\75\0\1\u0137\110\0"+
    "\1\u0138\51\0\1\u0139\161\0\1\u013a\27\0\1\u013b\64\0"+
    "\1\u013c\71\0\1\u013d\115\0\1\u013e\47\0\1\u013f\74\0"+
    "\1\u0140\113\0\1\u0141\65\0\1\u0142\65\0\1\u0143\101\0"+
    "\1\u0144\72\0\1\u0145\74\0\1\u0146\154\0\1\u0147\10\0"+
    "\1\u0148\102\0\1\u0149\72\0\1\u014a\62\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[14884];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\22\1\1\11\2\1\11\11"+
    "\1\1\3\11\5\1\2\11\1\1\1\10\5\0\1\11"+
    "\11\0\1\1\1\11\36\0\11\11\7\0\1\11\1\0"+
    "\1\11\7\0\2\11\5\0\1\11\13\0\1\11\12\0"+
    "\1\1\16\0\2\11\10\0\1\1\2\0\1\11\2\0"+
    "\1\11\2\0\1\11\1\0\1\11\1\0\1\11\2\0"+
    "\1\11\3\0\1\11\5\0\2\11\6\0\1\11\1\0"+
    "\2\11\7\0\1\11\3\0\1\11\4\0\1\11\6\0"+
    "\1\11\1\0\2\11\5\0\3\11\2\0\1\11\1\0"+
    "\1\11\1\0\1\1\4\0\1\11\1\0\1\11\1\1"+
    "\2\0\2\11\3\0\1\11\3\0\2\11\3\0\2\11"+
    "\1\0\1\11\2\0\1\11\1\0\1\11\1\0\2\11"+
    "\3\0\1\11\2\0\2\11\3\0\2\11\3\0\1\11"+
    "\5\0\1\11\2\0\1\11\2\0\2\11\3\0\1\11"+
    "\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[330];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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
  public _SimpleLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SimpleLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
    return zzBuffer.charAt(zzStartRead+pos);
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

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 100: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 101: break;
          case 3: 
            { return LETTER;
            }
          case 102: break;
          case 4: 
            { return LETTERORDIGIT;
            }
          case 103: break;
          case 5: 
            { return DIV;
            }
          case 104: break;
          case 6: 
            { return SEMICOLON;
            }
          case 105: break;
          case 7: 
            { return COLON;
            }
          case 106: break;
          case 8: 
            { return DOT;
            }
          case 107: break;
          case 9: 
            { return COMMA;
            }
          case 108: break;
          case 10: 
            { return LEFT_BRACE;
            }
          case 109: break;
          case 11: 
            { return RIGHT_BRACE;
            }
          case 110: break;
          case 12: 
            { return LEFT_PARENTHESIS;
            }
          case 111: break;
          case 13: 
            { return RIGHT_PARENTHESIS;
            }
          case 112: break;
          case 14: 
            { return LEFT_BRACKET;
            }
          case 113: break;
          case 15: 
            { return RIGHT_BRACKET;
            }
          case 114: break;
          case 16: 
            { return QUESTION_MARK;
            }
          case 115: break;
          case 17: 
            { return ADD;
            }
          case 116: break;
          case 18: 
            { return SUB;
            }
          case 117: break;
          case 19: 
            { return MUL;
            }
          case 118: break;
          case 20: 
            { return POW;
            }
          case 119: break;
          case 21: 
            { return MOD;
            }
          case 120: break;
          case 22: 
            { return NOT;
            }
          case 121: break;
          case 23: 
            { return GT;
            }
          case 122: break;
          case 24: 
            { return LT;
            }
          case 123: break;
          case 25: 
            { return AT;
            }
          case 124: break;
          case 26: 
            { return BACKTICK;
            }
          case 125: break;
          case 27: 
            { return AS;
            }
          case 126: break;
          case 28: 
            { return IN;
            }
          case 127: break;
          case 29: 
            { return IF;
            }
          case 128: break;
          case 30: 
            { return EQUAL;
            }
          case 129: break;
          case 31: 
            { return RANGE;
            }
          case 130: break;
          case 32: 
            { return RARROW;
            }
          case 131: break;
          case 33: 
            { return NOT_EQUAL;
            }
          case 132: break;
          case 34: 
            { return GT_EQUAL;
            }
          case 133: break;
          case 35: 
            { return LT_EQUAL;
            }
          case 134: break;
          case 36: 
            { return LARROW;
            }
          case 135: break;
          case 37: 
            { return AND;
            }
          case 136: break;
          case 38: 
            { return OR;
            }
          case 137: break;
          case 39: 
            { return ALL;
            }
          case 138: break;
          case 40: 
            { return TYPE_ANY;
            }
          case 139: break;
          case 41: 
            { return TYPE_INT;
            }
          case 140: break;
          case 42: 
            { return TYPE_MAP;
            }
          case 141: break;
          case 43: 
            { return TRY;
            }
          case 142: break;
          case 44: 
            { return VAR;
            }
          case 143: break;
          case 45: 
            { return TYPE_XML;
            }
          case 144: break;
          case 46: 
            { return ELSE;
            }
          case 145: break;
          case 47: 
            { return ENUM;
            }
          case 146: break;
          case 48: 
            { return TYPE_TYPE;
            }
          case 147: break;
          case 49: 
            { return SOME;
            }
          case 148: break;
          case 50: 
            { return BIND;
            }
          case 149: break;
          case 51: 
            { return TYPE_BLOB;
            }
          case 150: break;
          case 52: 
            { return LOCK;
            }
          case 151: break;
          case 53: 
            { return NEXT;
            }
          case 152: break;
          case 54: 
            { return FORK;
            }
          case 153: break;
          case 55: 
            { return WITH;
            }
          case 154: break;
          case 56: 
            { return JOIN;
            }
          case 155: break;
          case 57: 
            { return TYPE_JSON;
            }
          case 156: break;
          case 58: 
            { return ABORT;
            }
          case 157: break;
          case 59: 
            { return CATCH;
            }
          case 158: break;
          case 60: 
            { return CONST;
            }
          case 159: break;
          case 61: 
            { return TYPE_TABLE;
            }
          case 160: break;
          case 62: 
            { return THROW;
            }
          case 161: break;
          case 63: 
            { return BREAK;
            }
          case 162: break;
          case 64: 
            { return TYPE_FLOAT;
            }
          case 163: break;
          case 65: 
            { return WHILE;
            }
          case 164: break;
          case 66: 
            { return XMLNS;
            }
          case 165: break;
          case 67: 
            { return PUBLIC;
            }
          case 166: break;
          case 68: 
            { return ACTION;
            }
          case 167: break;
          case 69: 
            { return ATTACH;
            }
          case 168: break;
          case 70: 
            { return CREATE;
            }
          case 169: break;
          case 71: 
            { return IMPORT;
            }
          case 170: break;
          case 72: 
            { return RETURN;
            }
          case 171: break;
          case 73: 
            { return TYPEOF;
            }
          case 172: break;
          case 74: 
            { return TYPE_STRING;
            }
          case 173: break;
          case 75: 
            { return STRUCT;
            }
          case 174: break;
          case 76: 
            { return NATIVE;
            }
          case 175: break;
          case 77: 
            { return FAILED;
            }
          case 176: break;
          case 78: 
            { return WORKER;
            }
          case 177: break;
          case 79: 
            { return PACKAGE;
            }
          case 178: break;
          case 80: 
            { return PRIVATE;
            }
          case 179: break;
          case 81: 
            { return RETRIES;
            }
          case 180: break;
          case 82: 
            { return RETURNS;
            }
          case 181: break;
          case 83: 
            { return TIMEOUT;
            }
          case 182: break;
          case 84: 
            { return SERVICE;
            }
          case 183: break;
          case 85: 
            { return TYPE_BOOL;
            }
          case 184: break;
          case 86: 
            { return FINALLY;
            }
          case 185: break;
          case 87: 
            { return FOREACH;
            }
          case 186: break;
          case 88: 
            { return VERSION;
            }
          case 187: break;
          case 89: 
            { return ENDPOINT;
            }
          case 188: break;
          case 90: 
            { return RESOURCE;
            }
          case 189: break;
          case 91: 
            { return LENGTHOF;
            }
          case 190: break;
          case 92: 
            { return FUNCTION;
            }
          case 191: break;
          case 93: 
            { return CONNECTOR;
            }
          case 192: break;
          case 94: 
            { return ANNOTATION;
            }
          case 193: break;
          case 95: 
            { return STRUCTBODY;
            }
          case 194: break;
          case 96: 
            { return TRANSACTION;
            }
          case 195: break;
          case 97: 
            { return TRANSFORMER;
            }
          case 196: break;
          case 98: 
            { return XMLLOCALNAME;
            }
          case 197: break;
          case 99: 
            { return XMLNAMESPACENAME;
            }
          case 198: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
