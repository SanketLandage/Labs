package com.cg.Lab2;

import java.util.Scanner;

public class Lab2Ex4 {
	static int[] sortArr(int[] arr, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	static void modifyArr(int[] arr, int n) {

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[n - 1];
		for (int k = 0; k < temp.length; k++) {
			System.out.print(" " + temp[k]);
		}
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();

		int[] arr1 = new int[size];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please Enter elements in the array ");
			arr1[i] = Sc.nextInt();
		}

		int[] x = sortArr(arr1, size);

		for (int i = 0; i < x.length; i++) {
			System.out.print(" " + x[i]);
		}
		System.out.println("");
		System.out.println("dups removes arr");
		modifyArr(x, size);
	}

}
