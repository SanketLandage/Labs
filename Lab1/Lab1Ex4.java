package com.cg.Lab1;

import java.util.Scanner;

public class Lab1Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of fibonacci :- ");
		int num = sc.nextInt();
		for (int n = 2; n < num; n++) {

			int flag = 0;

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {

					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(n);
			}

		}
	}

}
