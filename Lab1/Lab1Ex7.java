package com.cg.Lab1;

import java.util.Scanner;

public class Lab1Ex7 {
	static void checkNumber(int n) {
		int flag = 0;
		int currentNumber = n % 10;
		n = n/10;
		while(n>0) {
			if(currentNumber <= n%10) {
				flag = 1;
				break;
			}
			currentNumber = n %10;
			n = n/10;
			
		}
		
		if(flag == 1) {
			System.out.println("False");
		}else {
			System.out.println("True");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an interger - ");
		int num = sc.nextInt();
		checkNumber(num);
	}
}
