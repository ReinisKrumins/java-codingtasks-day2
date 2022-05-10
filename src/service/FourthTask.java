package service;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println("--Is it odd?---");
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter your value- ");
        int isOdd = sc4.nextInt();

        if(isOdd % 2 == 0 || isOdd == 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
