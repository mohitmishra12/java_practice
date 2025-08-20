class Count_Secquenc {
    public int countSquares(int[][] matrix) {
        // tabulation
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++) {
            for(int j = 0;j<n;j++) {
                if(i==0 || j==0) {
                    count += matrix[i][j];
                }
                else if(matrix[i][j]==1) {
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i][j-1]));
                    count += matrix[i][j];
                }
            }
        }
        return count;
    }
}
