class Solution {
    public int[] plusOne(int[] one) {
        for (int i = one.length - 1; i >= 0; i--) {
            if (one[i] < 9) {
                one[i]++;
                return one;
            }
            one[i] = 0;
        }
        
        int[] value = new int[one.length + 1];
        value[0] = 1;
        return value;
    }
}
