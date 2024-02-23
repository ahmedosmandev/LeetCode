import java.util.Map;
import java.util.HashMap;

/**
 * Optimized solution to find two numbers that add up to a specific target.
 * Uses a single pass through the array, utilizing a HashMap to store and look for complements.
 */

class Solution{
    public int[] twoSum(int[] nums, int target) {
    // Create a HashMap to store the potential complement for each number.
        Map<Integer, Integer> complements = new HashMap<>();
        
        // Loop through each number in the array.
        for (int i = 0; i < nums.length; i++){
            // Check if the current number's complement has already been encountered.
            Integer complementIndex = complements.get(nums[i]);
            
            // If the complement is found, return the current index and the complement's index.
            if (complementIndex != null){
                return new int[]{complementIndex, i}; // Note: Corrected order to {complementIndex, i} to match expected output
            }
            
            // If not found, store this number's complement (target - current number) and its index.
            complements.put(target - nums[i], i);
        }
        // Return statement here to satisfy the compiler, in reality, a solution is always expected.
        return null; 
    }
}