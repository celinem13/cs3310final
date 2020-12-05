import java.util.Random;
import java.util.Arrays;
public class QuestionOne {
    public static void main(String[] args){
        Random r = new Random();
        int array[] = new int[100];
        for (int i = 0; i < 100; i++){
            int num = r.nextInt(100);
            array[i] = num;
            System.out.println(num);
        }
        System.out.println("\nSorted array:");
        Arrays.sort(array);
        for (int i = 0; i < 100; i++){
            System.out.println(array[i]);
        }
    }

    public static void insertSort(int a[]){
        for (int i = 1; i < a.length; i++){
            int current = a[i];
            int prevInt = i - 1;
            while(prevInt >= 0 && a[prevInt] > current){
                a[current + 1] = a[prevInt];
                prevInt = prevInt - 1;
            }
            a[prevInt + 1] = current;
        }
    }
}
