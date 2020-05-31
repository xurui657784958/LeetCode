import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
    public static double median(int[] array) {
        int heapSize = array.length / 2 + 1;
        PriorityQueue<Integer> heap = new PriorityQueue<>(heapSize);
        for (int i = 0; i < heapSize; i++) {
            heap.add(array[i]);
        }
        for (int i = heapSize; i < array.length; i++) {
            if (heap.peek() < array[i]) {
                heap.poll();
                heap.add(array[i]);
            }
        }
        if (array.length % 2 == 1) {
            return (double) heap.peek();
        } else {
            return (double) (heap.poll() + heap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arrayString = string.split(" ");
        int[] array = new int[arrayString.length];
        int j = 0;
        for (String i : arrayString){
            array[j] = Integer.valueOf(i);
            j++;
        }
        System.out.println(median(array));
    }
}

