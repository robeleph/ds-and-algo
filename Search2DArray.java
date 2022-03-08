class Search2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = 0;
        int colIdx = matrix[rowIdx].length - 1;
        
        while (rowIdx < matrix.length && colIdx >= 0) {
            if (matrix[rowIdx][colIdx] == target) {
                return true;
            } else if (matrix[rowIdx][colIdx] > target) {
                colIdx--;
            } else {
                rowIdx++;
            }
        }
        return false;
    }
}
