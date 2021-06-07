package com.cg.Lab3;

public class Lab3Ex3 {
	static void isVowel(String str) {
		String conso = "bcdfghjklmnpqrstvwxyz";
		char[] ch = str.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int id = conso.indexOf(ch[i]);
			if (id != -1) {
				ch[i] = conso.charAt((id + 1));
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		isVowel("MAVA");
	}
}
