class Solution {
  public int subarraysDivByK(int[] nums, int k) {
//     int ans = 0;
//     int prefix = 0;
//     int[] count = new int[k];
//     count[0] = 1;

//     for (final int num : nums) {
//       prefix = (prefix + num % k + k) % k;
//       ans += count[prefix];
//       ++count[prefix];
//     }

//     return ans;
//   }
Map <Integer, Integer> map = new HashMap<>();
int res = 0;
int prefix_sum = 0;
map.put(0,1);
for(int i =0; i<nums.length; i++){
    prefix_sum += nums[i];
    int r = prefix_sum % k;

    if(r<0){
        r += k;
    }

    if(map.containsKey(r)){
        res += map.get(r);
    }


    map.put(r,map.getOrDefault(r, 0) + 1);

}
return res;

}
}