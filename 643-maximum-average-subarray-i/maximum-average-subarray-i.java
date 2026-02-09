class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        int s = 0;
        int e = k;

        while(e <nums.length){
            sum -= nums[s];
            s++;

            sum += nums[e];
            e++;

            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum/k;
    }
}