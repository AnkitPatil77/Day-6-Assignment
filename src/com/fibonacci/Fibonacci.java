package com.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("How many elements you want to print " + "of fibonacci series?");

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		int prev = 0, current = 1;

		printSeries(prev, current, cnt);

		sc.close();
	}

	public static void printSeries(int prev, int current, int cnt) {
		if (cnt == 0) {
			return;
		}
		System.out.print(prev + "\t");
		printSeries(current, prev + current, --cnt);
	}

}
