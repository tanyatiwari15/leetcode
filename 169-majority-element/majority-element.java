class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums.length/2;
        int result = 0;
        Arrays.sort(nums);
        if(nums.length ==1){
                return nums[0];
            }
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(nums[i]!= nums[i+1]){
                count = 1;
            }
            if(count>maj){
                 result = nums[i];
            }
           
        }
        
       return result;
        
    }
}