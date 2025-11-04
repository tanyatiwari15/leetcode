class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target)
                return mid;

            // Check if the left half is sorted
            if (nums[s] <= nums[mid]) {
                // Target lies in the left half
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // Otherwise, right half must be sorted
            else {
                // Target lies in the right half
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1; 
    }
}
