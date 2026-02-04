class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int l = 0;
    int r = numbers.length - 1;
    while(l<r){
      int  currSum = numbers[l] + numbers[r];
        if(currSum > target){
            r--;
        }
        if(currSum < target){
            l++;
        
        }
        if(currSum == target){
            int[] result = {l+1 , r+1};
            return result;
        }
    }
    return new int[0];
       
    }       

}