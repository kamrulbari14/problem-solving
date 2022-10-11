package leetCode.longestNiceSubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {

    /*1763. Longest Nice Substring*/

    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (!charSet.contains(Character.toLowerCase(s.charAt(i))) || !charSet.contains(Character.toUpperCase(s.charAt(i)))) {
                String prev = longestNiceSubstring(s.substring(0, i));
                String next = longestNiceSubstring(s.substring(i + 1));
                return prev.length() >= next.length() ? prev : next;
            }
        }
        return s;
    }
}