class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        
        // Map to store (prefix sum, frequency)
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: prefix sum 0 occurs once
        
        for (int num : nums) {
            sum += num;
            
            // Check if (sum - k) exists in the map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // Update prefix sum count in map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
