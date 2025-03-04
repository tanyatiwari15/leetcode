class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int l = 0;
        int r = nums.length - 1;
        while(l<r){
            int temp = nums[r];
            nums[r]  = nums[l];
            nums[l]  = temp;
            l++;
            r--;
        }
         l = 0;
         r = k - 1;
        while(l<r){
            int temp = nums[r];
            nums[r]  = nums[l];
            nums[l]  = temp;
            l++;
            r--;
        }
        l = k;
         r = nums.length - 1;
        while(l<r){
            int temp = nums[r];
            nums[r]  = nums[l];
            nums[l]  = temp;
            l++;
            r--;
        }

        
    }
}