package org.Juggling;

public class ValidPattern {
    // Takes in Juggling SiteSwap pattern as input and determines if it is valid or not
    public int isValidPattern(String pattern) {

        // to be returned -1 for invalid pattern and 1 for valid pattern
        int result = 1;

        String validPattern = "";

        // create a new pattern based on mod of each character with its index
        for (int i = 0; i < pattern.length(); i++) {
            int num = (int) pattern.charAt(i) % (pattern.length());
            validPattern += Integer.toString(num);
        }

        for (int i = 0; i < validPattern.length(); i++) {

            char c = validPattern.charAt(i);

            // check if any character appears more than once
            if (validPattern.indexOf(c) != validPattern.lastIndexOf(c)) {
                result = -1;
                return result;
            }
        }
        return result;
    }
}
