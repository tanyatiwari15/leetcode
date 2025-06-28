class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
    Arrays.sort(nums);
    int n = nums.length;
    int lastsmaller = Integer.MIN_VALUE;
    int cnt = 0;
    int longest = 1;
    for(int i=0; i<n; i++){
        if(nums[i]-1 == lastsmaller){
            cnt++;
            lastsmaller = nums[i];
        }
        else if(lastsmaller!= nums[i]){
            cnt = 1;
            lastsmaller= nums[i];
        }
        longest= Math.max(longest, cnt);
    }
    return longest;

        
    }
}