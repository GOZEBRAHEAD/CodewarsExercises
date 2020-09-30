/*
Given a string str, reverse it omitting all non-alphabetic characters.

Example:
	- For str = "krishan", the output should be "nahsirk".

	- For str = "ultr53o?n", the output should be "nortlu".
*/

public class Kata {
    public static String reverseLetter(final String str) {
      
      StringBuilder finalString = new StringBuilder();
      
      int stringLength = str.length();
      
      for (int i = stringLength-1; i >= 0; i--) {
        
        char c = str.charAt(i);
        
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
          finalString.append(c);
      }
      
      return finalString.toString();
    }
}
