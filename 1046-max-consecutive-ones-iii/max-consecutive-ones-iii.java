class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_w = 0;
        int max_z = 0;
        int l =0;
       

        for (int r=0; r<nums.length; r++){
            if(nums[r] == 0){
                max_z += 1;
            }
        
        while(max_z > k){
            if(nums[l] == 0){
                max_z -= 1;
              
            }
              l++;
        }
     int   w = r-l+1;
        max_w = Math.max(max_w, w);
      

    }
      return max_w;
    }
}