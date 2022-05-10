package service;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println("--Is it even?---");
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter your value- ");
        int isEven = sc3.nextInt();

        if(isEven % 2 == 0 || isEven == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
