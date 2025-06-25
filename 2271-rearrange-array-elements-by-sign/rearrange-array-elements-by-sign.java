class Solution {
    public int[] rearrangeArray(int[] nums) {
        
         ArrayList<Integer> positives = new ArrayList<>();
         ArrayList<Integer> negatives = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                positives.add(nums[i]);

            }
            else{
                negatives.add(nums[i]);
            }
        }
         int[] result = new int[nums.length];
        int i = 0, pos = 0, neg = 0;

        
        while (pos < positives.size() && neg < negatives.size()) {
            result[i++] = positives.get(pos++);
            result[i++] = negatives.get(neg++);
        }
        return result;
        
    }
}