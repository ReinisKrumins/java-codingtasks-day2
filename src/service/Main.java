package service;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            First task
         */

        System.out.println("--Compare 2 integers---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int firstValue = sc.nextInt();
        System.out.print("Enter second number- ");
        int secondValue = sc.nextInt();

        System.out.println("Is " + firstValue + " equal to " + secondValue + "?" + (firstValue == secondValue));
        System.out.println("Is " + firstValue + " less " + secondValue + "?" + (firstValue < secondValue));
        System.out.println("Is " + firstValue + " less or equal to " + secondValue + "?" + (firstValue <= secondValue));
        System.out.println("Is " + firstValue + " greater " + secondValue + "?" + (firstValue > secondValue));
        System.out.println("Is " + firstValue + " greater or equal " + secondValue + "?" + (firstValue >= secondValue));

        /*
            Second task
         */
        System.out.println("--Compare 2 booleans---");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input first boolean ");
        boolean bn1 = sc2.nextBoolean();
        System.out.print("Input second boolean ");
        boolean bn2 = sc2.nextBoolean();

        if(bn1 == bn2){
            System.out.println("Are they equal?" + "true");
        }else{
            System.out.println("Are they equal?" + "false");
        }

        /*
            Third task
         */

        System.out.println("--Is it even?---");
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter your value- ");
        int isEven = sc3.nextInt();

        if(isEven % 2 == 0 || isEven == 0){
            System.out.println("True");
        }else{
            System.out.println("Talse");
        }

        /*
            Fourth task
         */
        System.out.println("--Is it odd?---");
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter your value- ");
        int isOdd = sc4.nextInt();

        if(isOdd % 2 == 0 || isOdd == 0){
            System.out.println("Talse");
        }else{
            System.out.println("True");
        }

        /*
            Fifth task
         */
        System.out.println("--Output opposite---");
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Input a boolean value ");
        boolean booleanValue = sc5.nextBoolean();
        if(booleanValue == true){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
        /*
            Sixth task
         */
        System.out.println("Sixth task");
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int firstNumber = sc6.nextInt();
        System.out.print("Enter second number- ");
        int secondNumber = sc6.nextInt();

        System.out.println(firstNumber == secondNumber);

        if(firstNumber == secondNumber){
            System.out.println("True");
        }else if(firstNumber < 0 && secondNumber > 0){
            System.out.println("True");
        }else if(firstNumber > 100 && secondNumber > 100){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}