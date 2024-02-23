class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Start of the twoSum function. It finds two numbers in 'nums' that add up to 'target'.
        // Returns the indices of these two numbers.

        // Loop through each number in 'nums'.
        for (int i = 0; i < nums.length; i++) {
            // 'i' is the index of the first number.

            // Compare 'i' with every other number after it.
            for (int j = i + 1; j < nums.length; j++) {
                // 'j' is the index of the second number.

                // Check if the sum of nums[i] and nums[j] equals 'target'.
                if (nums[i] + nums[j] == target) {
                    // If they add up to 'target', return their indices.
                    return new int[]{i, j};
                }
            }
        }
        // If no two numbers add up to 'target', return the original array.
        // Note: According to the problem statement, a solution always exists, so you might never reach this line.
        // It's better to return null or throw an exception if no solution is found.
        return null; 
    }
}






    
