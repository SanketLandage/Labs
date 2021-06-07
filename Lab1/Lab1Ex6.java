package com.cg.Lab1;

import java.util.Scanner;

public class Lab1Ex6 {
	static void calculateDifference(int n) {
		int sumOfSquares=0 , sumOfDigit=0 , squareOfSum = 0;
		for(int i = 0 ; i <= n ; i++) {
			sumOfSquares = sumOfSquares + ( i * i );
			sumOfDigit = sumOfDigit + i;
			squareOfSum = sumOfDigit * sumOfDigit;
		}
		System.out.println(sumOfSquares - squareOfSum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an interger - ");
		int num = sc.nextInt();
		
		calculateDifference(num);
	}
}
