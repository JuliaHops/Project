package lab1.task4;

import java.util.Scanner;
public class Sum {
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
        int sum2 = 0;
        int i = 0;
        while (size > i) {
            sum2 += array[i];
            i += 1;
        }
        System.out.println(sum2);
        int sum3 = 0;
        i = 0;
        do {
            sum3 += array[i];
            i += 1;
        } while (i < size);
        System.out.println(sum3);
        int ma = -10000000;
        int mi = 10000000;
        for (i = 0; i < size; i++){
            if (array[i]>ma){
                ma = array[i];
            }
            if (array[i]< mi){
                mi = array[i];
            }
        }
        System.out.print(ma+ " " + mi);
    }
}
