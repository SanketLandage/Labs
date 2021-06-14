package com.cg.Lab3;

import java.util.Scanner;

public class Lab3Ex8 {
	public static void checkString(String s) {
		s.toLowerCase();
		int c=0 , d=0;
		for(int i = 0 ; i < s.length()-1 ; i++) {
			 c = s.charAt(i);
			 d = s.charAt(i+1);
		}
		if(c>d) {
			System.out.println("Not a increasing");
		}
		else {
			System.out.println("Increasing");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		sc.close();
		checkString(str);
	}
}
