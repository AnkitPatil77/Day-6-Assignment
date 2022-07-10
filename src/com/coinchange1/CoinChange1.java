package com.coinchange1;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange1 {

	int[] denominations;

	public CoinChange1() {
		denominations = new int[] { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
	}

	public static void main(String[] args) {
		System.out.println("How much amount of change you want?");

		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();
		int[] ds = new int[amount + 1];
		//to fill all values as -1 in array
		Arrays.fill(ds, -1);
		CoinChange1 coinChange = new CoinChange1();
		System.out.println("min coin required for amount " + amount + " : " + coinChange.minCoin(amount, ds));

		sc.close();
	}

	public int minCoin(int amount, int[] ds) {
		if (amount == 0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < denominations.length; i++) {
			if (amount - denominations[i] >= 0) {
				int subAnswer;
				if (ds[amount - denominations[i]] == -1) {
					subAnswer = minCoin(amount - denominations[i], ds);
				} else {
					subAnswer = ds[amount - denominations[i]];
				}
				if (subAnswer < ans) {
					ans = subAnswer + 1;
				}
			}
		}
		ds[amount] = ans;
		return ans;
	}
}
