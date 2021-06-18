package com.cg.Lab5;



class MyException2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException2(String s) {
		super(s);
	}
}

public class Lab5Ex2 {
	public static void validate(String s1, String s2) throws MyException2 {
		if (s1.isBlank() || s2.isBlank()) {
			throw new MyException2(" You must enter First name and Last Name.!");
		} else {
			System.out.println(" You are Welcome...!!");
		}
	}

	public static void main(String[] args) {
		String fName = "";
		String lName = "Sanket";
		try {
			validate(fName, lName);
		} catch (MyException2 me) {
			//System.out.println("Exception Occured " + me.getMessage());
			me.getMessage().toString();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}


//public class Source {
//  //Implement the two function given in description in here...
// 
//  public static void handleException(Activity a){
//    if(a.string1 == null || a.string2 == null){
//      throw new NullPointerException("Null values found");
//    }
//    if(a.operator != "+" && a.operator != "-"){
//      throw new Exception(a.operator);
//    }
//  }
//	public static void main(String args[] ) throws Exception {
//    //Write your own main to check the program...
//   Activity a = new Activity();
//   handleException(a);
//	}
//}