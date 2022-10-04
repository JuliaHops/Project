package lab1.task7;

import java.util.Scanner;
public class Factorial {
    public static int fact(int size) {
        int a=1;
        for (int i = 1; i < size + 1; i++){
            a = a * i;
        }
        return (a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(fact(x));
    }
}


