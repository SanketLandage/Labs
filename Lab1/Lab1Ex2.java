package com.cg.Lab1;
import java.util.Scanner;
public class Lab1Ex2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the choice red/yellow/green  - ");
		 String ch = sc.next();
		 
		 switch(ch) {
		 case "red": System.out.println("Light is red you should STOP..!");
		 			break;
		 case "green" : System.out.println("You can Go ..");
		 				break;
		 case "yellow": System.out.println("Be Ready!");
		 				break;
		 default: System.out.println("wrong input");
		 			
		 }
		 
	}

}
