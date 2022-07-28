package ko.alliex.energy.framework.util;

import com.ibm.icu.text.Transliterator;


public class FullWidthHalfWidth {

    public static String zenkakuToHankaku(String s) {
        if (s == null) {
            return null;
        }
        Transliterator transliterator = Transliterator.getInstance("Fullwidth-Halfwidth");
        return transliterator.transliterate(s);
    }

    public static String hankakuToZenkaku(String s) {
        if (s == null) {
            return null;
        }
        Transliterator transliterator = Transliterator.getInstance("Halfwidth-Fullwidth");
        return transliterator.transliterate(s);
    }

    public static String zenkakuAlphabetToHankaku(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'ａ' && c <= 'ｚ') {
                sb.setCharAt(i, (char) (c - 'ａ' + 'a'));
            } else if (c >= 'Ａ' && c <= 'Ｚ') {
                sb.setCharAt(i, (char) (c - 'Ａ' + 'A'));
            } else if (c >= '０' && c <= '９') {
                sb.setCharAt(i, (char) (c - '０' + '0'));
            }
        }
        return sb.toString();
    }

    public static String hankakuAlphabetToZenkaku(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.setCharAt(i, (char) (c + 'ａ' - 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                sb.setCharAt(i, (char) (c + 'Ａ' - 'A'));
            } else if (c >= '0' && c <= '9') {
                sb.setCharAt(i, (char) (c + '０' - '0'));
            }
        }
        return sb.toString();
    }

}
