class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        
        s = s.replaceAll("^\\s+", "");
        int i = 0;
        boolean isNegative = s.startsWith("-");
        boolean isPositive = s.startsWith("+");
        
        if (isNegative)
            i++;
        else if (isPositive)
            i++;

        double number = 0;
        
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            number = number * 10 + (s.charAt(i) - '0');
            i++;
        }
        number = isNegative ? -number : number;
        if (number < INT_MIN) {
            return INT_MIN;
        }
        if (number > INT_MAX) {
            return INT_MAX;
        }
        return (int) number;
    }
}