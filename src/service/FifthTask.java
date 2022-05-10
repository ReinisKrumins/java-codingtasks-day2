package service;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println("--Output opposite---");
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Input a boolean value ");
        boolean booleanValue = sc5.nextBoolean();
        if(booleanValue == true){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
