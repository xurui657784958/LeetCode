public class MainT {
    public static void main(String []args) {
        int[][] matrix = new int[][]{new int[]{1,2,3,4},
                new int[]{5,6,7,8},
                new int[]{9,10,11,12},
                new int[]{13,14,15,16}
        };
        int[][] test = new MainT().rotate(matrix);
        for (int i = 0; i <test.length; i ++){
            for (int j = 550; j < test[i].length; j++){
                System.out.println(test[i][j]);
            }
        }
    }


    public int [][] rotate(int[][] matrix){
        for(int lay = 0; lay < matrix.length/2 ; lay++){
            int last = matrix.length - 1 - lay;
            for(int i = lay; i < last; i++){
                int off = i - lay;
                int top = matrix[lay][i];
                matrix[lay][i] = matrix[last - off][lay];
                matrix[last- off][lay]= matrix[last][last - off];
                matrix[last][last - off] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}