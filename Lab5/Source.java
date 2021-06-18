package com.cg.Lab5;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Activity{
    String string1;
    String string2;
    String operator;

    Activity(String string1, String string2 , String operator){
      this.string1 = string1;
      this.string2 = string2;
      this.operator = operator;
    }
  //Implement Activity class here..
}

public class Source {
	
	public static String handleException(Activity a) throws Exception {
		
			if(a.string1.isEmpty() || a.string2.isEmpty()) {
				throw new NullPointerException("Null Value Found");
			};
			if(a.operator != "+" && a.operator != "-") {
				throw new Exception("Exeption occured" + a.operator);
			}
		
		String str= "No Exp found";
		return str;
	}
	
	
	public static void main(String[] args) {
		Activity ac = new Activity("sa" , "as" , "-");
		String j=null;
		try {
			j = Source.handleException(ac);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(j);
	}
}
