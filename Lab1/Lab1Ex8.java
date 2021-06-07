package com.cg.Lab1;

import java.util.Scanner;

public class Lab1Ex8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        while(n % 2==0)
         {
              n=n/2;
         }
        if(n==1)
         {
           System.out.println("It is a Power of a two number");
         }
        else
         {
            System.out.println("It is not Power of a two number");
         };
    }
}
