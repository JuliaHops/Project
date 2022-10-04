package lab1.task6;

import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a;
        for (int i = 1; i < 11; i++){
            a = 1./i;
            String str = String.format("%.2f ", a);
            System.out.println(str);
        }
    }
}