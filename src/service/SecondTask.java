package service;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        System.out.println("--Compare 2 booleans---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first boolean: ");
        boolean bn1 = sc.nextBoolean();
        System.out.print("Input second boolean: ");
        boolean bn2 = sc.nextBoolean();

        if(bn1 == bn2){
            System.out.println("Are they equal?" + "true");
        }else{
            System.out.println("Are they equal?" + "false");
        }
    }
}
