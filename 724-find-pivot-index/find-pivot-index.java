class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum = 0;
        int right_sum =0;
        int total_sum =0;
        int pivot = 0;
        for(int j=0; j<nums.length; j++){
            total_sum += nums[j];
        }

        for(int i=0; i<nums.length; i++){
            left_sum += nums[i];
            right_sum = total_sum -left_sum ;
            if(left_sum - nums[i] == right_sum){
                pivot = i;
                return pivot;
            }
           

        }
        return -1;
        
    }
}