package com.cg.Lab5;

import java.util.Scanner;

class EmployeeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmployeeException(String S){
		super(S);
	}
}

public class Lab5Ex3 {
	void validateSalary(double salary) throws EmployeeException {
		if(salary < 3000) {
			throw new EmployeeException("Salary is below 3000 ...");
		}
		else {
			System.out.println("Salary is Above 3000 ! ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the salary of employee ? ");
		double salary = sc.nextDouble();
		sc.close();
		Lab5Ex3 obj = new Lab5Ex3();
		try {
			obj.validateSalary(salary);
		}
		catch(EmployeeException ee) {
			System.out.println("Exception Occured " + ee);
		}
	}
}
