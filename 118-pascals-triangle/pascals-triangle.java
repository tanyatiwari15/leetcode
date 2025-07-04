class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();

        
        for (int row= 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
       
        
    }
     public static List<Integer> generateRow(int numRows){
     long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col =1; col<numRows; col++){
            ans = ans*(numRows - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
     }
}