package service;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        System.out.println("--Compare 2 integers---");
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number- ");
        int firstValue = sc.nextInt();
            System.out.print("Enter second number- ");
        int secondValue = sc.nextInt();

            System.out.println("Is "+firstValue +" equal to "+secondValue +"?"+(firstValue ==secondValue));
            System.out.println("Is "+firstValue +" less "+secondValue +"?"+(firstValue<secondValue));
            System.out.println("Is "+firstValue +" less or equal to "+secondValue +"?"+(firstValue <=secondValue));
            System.out.println("Is "+firstValue +" greater "+secondValue +"?"+(firstValue >secondValue));
            System.out.println("Is "+firstValue +" greater or equal "+secondValue +"?"+(firstValue >=secondValue));
    }
}
