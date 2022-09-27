package lab1.task3;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        int sum1 = 0;
        for (int i = 0; i < size; i++){
            sum1 += array[i];
        }
        System.out.println(sum1);
        System.out.println((float)sum1/(float)size);

    }
}
