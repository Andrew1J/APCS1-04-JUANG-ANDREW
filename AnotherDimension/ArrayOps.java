public class ArrayOps{
    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
    public static int[] sumRows(int[][] matrix){
        int[] sums = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            sums[i] = sum(matrix[i]);
        }
        return sums;
    }
    public static int[] largestInRows(int[][] matrix){
        int[] large = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            large[i] = largest(matrix[i]);
        }
        return large;
    }
    public static int sum(int[][] arr){
        return sum(sumRows(arr));
    }
    public static int[] sumCols(int[][] matrix){
        int[] colsums = new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int sum = 0;
            for(int j=0;j<matrix.length;j++){
                sum += matrix[j][i];
            }
            colsums[i] = sum;
        }
        return colsums;
    }
    public static boolean isRowMagic(int[][] matrix){
        boolean res = true;
        int[] rowsums = sumRows(matrix);
        for(int i=0;i<rowsums.length-1;i++){
            if(rowsums[i]!=rowsums[i+1]){
                res = false;
            }
        }
        return res;
    }
    public static boolean isColMagic(int[][] matrix){
        boolean res = true;
        int[] colsums = sumCols(matrix);
        for(int i=0;i<colsums.length-1;i++){
            if(colsums[i]!=colsums[i+1]){
                res = false;
            }
        }
        return res;
    }
    public static boolean isLocationMagic(int[][] matrix, int row, int col){
        int[] colsums = sumCols(matrix);
        int[] rowsums = sumRows(matrix);
        return colsums[col] == rowsums[row];
    }
}
