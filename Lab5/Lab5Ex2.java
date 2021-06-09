package com.cg.Lab5;

import java.util.Scanner;

class MyException2 extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException2(String s){
		super(s);
	}
}

public class Lab5Ex2 {
	public static void validate(String s1 , String s2) throws  MyException2 {
		if(s1.length()==0 || s2.length()== 0) {
			throw new MyException2(" You must enter First name and Last Name.!");
		}
		else {
			System.out.println(" You are Welcome...!!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : - ");
		String fName = sc.next();
		System.out.println("Enter First Name : - ");
		String lName = sc.next();
		sc.close();
		try {
			validate(fName,lName);
		}
		catch(MyException2 me){
			System.out.println("Exception Occured " + me.getMessage());
		}
	}
}
