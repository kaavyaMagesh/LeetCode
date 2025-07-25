class Solution {
    public void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        reverseRows(matrix);

}
private void transposeMatrix(int [][] matrix){
    for(int i=0;i<matrix.length;i++){
        for(int j=i;j<matrix[0].length;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }

}
private void reverseRows(int [][] matrix){
    
for(int i=0;i<matrix.length;i++){
    int left=0;
    int right=matrix.length-1;

    
        while(left<right){
        int temp=matrix[i][left];
        
        matrix[i][left]=matrix[i][right];
        matrix[i][right]=temp;
        left++;
        right--;
        }
    }
}
    }
