class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //find which row the target is on
        int lo = 0;
        int hi = matrix.length * matrix[0].length - 1;

        int rows = matrix.length;
        int cols = matrix[0].length;

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target) {
                return true;
            }
            if(matrix[row][col] < target) {
                lo = mid + 1;
            } else  {
                hi = mid - 1;
            }

        }

        return false;

    }

}
