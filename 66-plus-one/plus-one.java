class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length - 1; i>=0; i--) {
            int curr = digits[i] + carry;
            if(curr >= 10) {
                digits[i] = curr % 10;
                carry = 1;
            }else {
                digits[i] = curr;
                carry = 0;
            }
        }
        if(carry == 1) {
            int ans[] = new int[digits.length + 1];
            ans[0] = 1;
            return ans;        
            }
        return digits;
    }
}