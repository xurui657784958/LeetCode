public class Find {
    public static void main(String[] args){
        int [] A ={1,2,3,2,1};
        int [] B ={3,2,1,4,7};
        System.out.println(new Find().findMaxLength(A,B));
    }
    public int findMaxLength(int[] A, int[] B){

        int a = A.length;
        int b = B.length;
        int temp[][] = new int[a][b];
        int max = 0;
        for(int j = 0; j < b; j++){
            temp[0][j] = B[j] == A[0] ? 1 : 0;
        }
        for(int i = 0; i < a; i++){
            temp[i][0] = A[i] == B[0] ? 1 : 0;
        }

        for( int i = 1; i < a; i++){
            for( int j = 1; j < b; j++){
                temp[i][j] = A[i] == B[j] ? (temp[i -1][j -1] + 1): 0;
            }
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }
        return max;
    }
}
