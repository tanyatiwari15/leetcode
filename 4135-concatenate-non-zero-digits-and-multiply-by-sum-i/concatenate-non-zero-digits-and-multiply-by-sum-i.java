class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int x = 0;

        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (digit != 0) {
                sum += digit;
                x = x * 10 + digit;
            }
        }

        return (long) x * sum;
    }
}