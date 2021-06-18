package com.cg.Lab3;

import java.util.Scanner;

public class Lab3Ex4 {
	int modifyNumber(int num) {
        String str = Integer.toString(num);
        int rem=0;
        
        StringBuffer sb = new StringBuffer();
        for(int i =0 ; i < str.length()-1 ;i++) {
        int    temp = str.charAt(i+1) - str.charAt(i);
            sb.append(Math.abs(temp));
        }
        if(str.length() % 10 != 0) {
             rem = num%10;
        }
       sb.append(rem);
        int n = Integer.parseInt(sb.toString());
        return n;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();
        sc.close();
        Lab3Ex4 obj = new Lab3Ex4();
        int x = obj.modifyNumber(num);
        System.out.println(x);
    }
}