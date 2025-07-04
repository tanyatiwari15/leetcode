class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        if(nums.length==1 ){
            for (int i = 0; i < nums.length; i++) {
             ans.add(nums[i]);
            
          }
          return ans;
        }
       
    
        
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1 );
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                ans.add(entry.getKey());
    }
}

return ans;

        
    }
}