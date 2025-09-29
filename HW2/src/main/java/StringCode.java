// CS108 HW1 -- String static methods

import java.util.HashSet;

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		if( str == null || str.length() == 0) {
            return 0;
        }
        int result = 0;
        int count = 0;
        char key = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                count ++;
            } else {
                key = str.charAt(i);
                count = 1;
            }
            result = Math.max(result,count);
        }
        return result; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int digit = 0;
        char character;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if(i != str.length() - 1) {
                    digit = str.charAt(i) - '0';
                    character = str.charAt(i + 1);
                    for (int j = 0; j < digit; j++) {
                        result.append(character);
                    }
                }
            } else {
                character = str.charAt(i);
                result.append(character);
            }
        }
		return result.toString(); // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {

        if(a == null || b == null || a.length() < len || b.length() < len) {
            return false;
        }

        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < a.length() - len; i++) {
            String s = a.substring(i, i + len);
            set.add(s);
        }
        for(int j = 0; j < b.length()-len; j++) {
            String s = b.substring(j, j + len);
            if(set.contains(s)) {
                return true;
            }
        }
		return false; // YOUR CODE HERE
	}

}
