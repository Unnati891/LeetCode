class Solution {
    public int myAtoi(String s) {
        // if(s==null||s.length()==0){
        //     return 0;
        // }
        // int i=0;
        // while(i<s.length() && s.charAt(i)==' '){
        //     i++;
        // }
        // if(i==s.length()){
        //     return 0;
        // }
        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits into integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // Step 4: Handle overflow
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }
}