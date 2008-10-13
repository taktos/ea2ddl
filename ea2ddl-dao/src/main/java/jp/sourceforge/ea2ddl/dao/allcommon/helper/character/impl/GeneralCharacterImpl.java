package jp.sourceforge.ea2ddl.dao.allcommon.helper.character.impl;

import jp.sourceforge.ea2ddl.dao.allcommon.helper.character.GeneralCharacter;

/**
 * The implementation of general character.
 * @author DBFlute(AutoGenerator)
 */
public class GeneralCharacterImpl implements GeneralCharacter {

    public String toSingleByteAlphabet(String target) {
        if (target == null) {
            return target;
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < target.length(); i++) {
            final char currentChar = target.charAt(i);

            if (currentChar >= 0xff21 && currentChar <= 0xff3a) {
                sb.append(toSingleByteCharacter(currentChar));
            } else if (currentChar >= 0xff41 && currentChar <= 0xff5a) {
                sb.append(toSingleByteCharacter(currentChar));
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public String toSingleByteNumber(String target) {
        if (target == null) {
            return target;
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < target.length(); i++) {
            final char currentChar = target.charAt(i);
            if (currentChar >= 0xff10 && currentChar <= 0xff19) {
                sb.append(toSingleByteCharacter(currentChar));
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public String toSingleByteAlphabetNumber(String target) {
        if (target == null) {
            return target;
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < target.length(); i++) {
            final char currentChar = target.charAt(i);

            if (currentChar >= 0xff10 && currentChar <= 0xff19) {
                sb.append(toSingleByteCharacter(currentChar));
            } else if (currentChar >= 0xff21 && currentChar <= 0xff3a) {
                sb.append(toSingleByteCharacter(currentChar));
            } else if (currentChar >= 0xff41 && currentChar <= 0xff5a) {
                sb.append(toSingleByteCharacter(currentChar));
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public String toSingleByteAlphabetNumberMark(String target) {
        if (target == null) {
            return target;
        }
        final StringBuffer sb = new StringBuffer(target.length());
        for (int i = 0; i < target.length(); i++) {
            final char currentChar = target.charAt(i);
            if (currentChar >= 0xff01 && currentChar <= 0xff5e) {
                sb.append(toSingleByteCharacter(currentChar));

            // It needs to  append more mark...
            } else if (currentChar == '\u2019' || currentChar == '\u2018' || currentChar == '\u2032') {
                sb.append('\'');
            } else if (currentChar == '\u201d' || currentChar == '\u201c' || currentChar == '\u2033') {
                sb.append('\"');
            } else if (currentChar == '\uffe5') {
                sb.append('\\');
            } else if (currentChar == '\u2010') {
                sb.append('-');
            } else if (currentChar == '\uff5e') {
                sb.append('~');
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    protected char toSingleByteCharacter(final char currentChar) {
        return (char) (currentChar - 0xfee0);
    }
}
