class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
   

      while(l<r){
          int length = Math.abs(l - r);
        if(height[l]>height[r]){
            int temp1 = length*height[r];
            if(max<temp1){
                max = temp1;
            }
            r--;

            
        }
        else{
            int temp2= length*height[l];
             if(max<temp2){
                max = temp2;
            }

            l++;
        }
      }
      return max;

        
    }
}