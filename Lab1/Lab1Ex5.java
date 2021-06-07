package com.cg.Lab1;

import java.util.Scanner;

public class Lab1Ex5 {
	static void calculateSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if ((i % 3) == 0 || (i % 5) == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an interger - ");
		int num = sc.nextInt();
		calculateSum(num);
	}
}
