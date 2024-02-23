class Solution {
   public boolean isPalindrome(int x) {
    // Step 1: Negative numbers are not palindromes
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }
    
    int reversedHalf = 0;
    while (x > reversedHalf) {
        reversedHalf = reversedHalf * 10 + x % 10;
        x /= 10;
    }
    
    // Step 4 & 5: Check if the original number is equal to the reversed half
    // or if the original number is equal to the reversed half without the middle digit
    return x == reversedHalf || x == reversedHalf / 10;
}

}