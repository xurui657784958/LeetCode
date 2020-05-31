import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinSteps {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();


    }
    public static int minSteps(int arr[][]){
        int n = arr.length;
        boolean v[][] = new boolean[n][n];
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(0,0));
        int depth = 0;
        //BFS
        while (queue.size() != 0){
            int x = queue.size();
            while (x-- > 0){
                Pair y = queue.peek();
                int i = y.first, j = y.second;
                queue.remove();
                if (v[i][j])
                    continue;
                if (i == n - 1 && j == n - 1)
                    return depth;
                v[i][j] = true;
                if ( i + arr[i][j] < n)
                    queue.add(new Pair(i +arr[i][j],j));
                if (j +arr[i][j] < n)
                    queue.add(new Pair(i ,j +arr[i][j]));
            }
            depth++;
        }
        return -1;
    }

    static class Pair{
        int first, second;
        Pair(int a, int b){
            first = a;
            second = b;
        }
    }
}
