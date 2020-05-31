import java.util.Scanner;

public class MSTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

    }

    public static void getArray(int[] building,int[] packages){
        int[] tempBuilding = new int[building.length];
        int sum = 0;
        for (int i = 0 ; i < tempBuilding.length; i++){
            sum = sum + building[i];
            tempBuilding[i] = sum;
        }
    }

    public static int findIndex(int[] arr, int temp){
        int min = 0;
        int max = arr.length;
        int middle = (min + max)/2;
        while (arr[middle] != temp){
            if (arr[middle] > temp){
                max = middle - 1;
            }else if(arr[middle] < temp){
                min = middle + 1;
            }
            middle = (min + max)/2;
            if (min > max){
                return  -1;
            }
        }
        return middle;
    }
}
