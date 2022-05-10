package service;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        System.out.println("Sixth task");
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int firstNumber = sc6.nextInt();
        System.out.print("Enter second number- ");
        int secondNumber = sc6.nextInt();

        if((firstNumber == secondNumber || firstNumber<0 && secondNumber>0 || firstNumber > 100 && secondNumber >100)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
