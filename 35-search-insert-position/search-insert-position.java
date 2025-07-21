class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
            if(nums[mid]>target){
                ans = mid;
            }
            else{
            ans = mid+1;
            }
        }
        return ans;
        
    }
}