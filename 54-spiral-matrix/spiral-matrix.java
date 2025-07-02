class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList <Integer> list = new ArrayList <> ();
        int left = 0;
        int right = (matrix[0].length) -1;
        int top = 0;
        int bottom = matrix.length - 1;
 while(left<=right && top<=bottom){

    for(int i = left; i<=right; i++){
            list.add( matrix[top][i]);
          
        }
          top += 1;
    for(int i= top; i<=bottom; i++ ){
            list.add(matrix[i][right]);
           
        }
         right -= 1;
    for(int i = right; i>=left && top<=bottom; i--){
            list.add(matrix[bottom][i]);
           
        }
         bottom -= 1;
    for(int i=bottom; i>=top && left<=right; i--){
            list.add( matrix[i][left]);
           
        }
         left += 1;
        }
        return list;
    }
}