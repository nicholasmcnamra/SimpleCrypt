import java.io.CharArrayWriter;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private Character cf;
    private Character cs;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
    }

    public String crypt(String text) throws UnsupportedOperationException {
        char [] newCharArr = text.toCharArray();
        CharArrayWriter cipher = new CharArrayWriter();
        int moveText = cf - cs;
        for (int i = 0; i < newCharArr.length; i ++) {
            char charForCipher = 0;
            int charAscii = newCharArr[i] + moveText;
            if (newCharArr[i] >= 65 && newCharArr[i] <= 90) {
                if (charAscii > 90) {
                    charAscii -= 26;
                }
                    charForCipher = (char) charAscii;
            }
            else if (newCharArr[i] >= 97 && newCharArr[i] <= 122) {
                if (charAscii > 122) {
                    charAscii -= 26;
                }
                charForCipher = (char) charAscii;
            }
            else {
                charForCipher = newCharArr[i];
            }
            cipher.append(charForCipher);
        }
        return cipher.toString();
    }

    public String encrypt(String text) {
        char [] newCharArr = text.toCharArray();
        CharArrayWriter cipher = new CharArrayWriter();
        int moveText = cf - cs;
        for (int i = 0; i < newCharArr.length; i ++) {
            char charForCipher = 0;
            int charAscii = newCharArr[i] + moveText;
            if (newCharArr[i] >= 65 && newCharArr[i] <= 90) {
                if (charAscii > 90) {
                    charAscii -= 26;
                }
                charForCipher = (char) charAscii;
            }
            else if (newCharArr[i] >= 97 && newCharArr[i] <= 122) {
                if (charAscii > 122) {
                    charAscii -= 26;
                }
                charForCipher = (char) charAscii;
            }
            else {
                charForCipher = newCharArr[i];
            }
            cipher.append(charForCipher);
        }
        return cipher.toString();
//        return text;
    }

    public String decrypt(String text) {
        char [] newCharArr = text.toCharArray();
        CharArrayWriter cipher = new CharArrayWriter();
        int moveText = cf - cs;
        for (int i = 0; i < newCharArr.length; i ++) {
            char charForCipher = 0;
            int charAscii = newCharArr[i] - moveText;
            if (newCharArr[i] >= 65 && newCharArr[i] <= 90) {
                if (charAscii < 65) {
                    charAscii += 26;
                }
                charForCipher = (char) charAscii;
            }
            else if (newCharArr[i] >= 97 && newCharArr[i] <= 122) {
                if (charAscii < 97) {
                    charAscii += 26;
                }
                charForCipher = (char) charAscii;
            }
            else {
                charForCipher = newCharArr[i];
            }
            cipher.append(charForCipher);
        }
        return cipher.toString();
//        return text;
    }

    public static String rotate(String s, Character c) {
        char [] sToCharArr = s.toCharArray();
        CharArrayWriter res = new CharArrayWriter();
        int rotateIndex = new String(sToCharArr).indexOf(c);
        for (int i = rotateIndex; i < s.length(); i++) {
            res.append(sToCharArr[i]);
            }
        for (int i = 0; i < rotateIndex; i++) {
            res.append(s[i]);
        }
        return res.toString();
    }

}
