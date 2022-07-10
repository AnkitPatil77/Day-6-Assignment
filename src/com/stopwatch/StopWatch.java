package com.stopwatch;

import java.util.Scanner;

public class StopWatch {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 's' to start the stop watch : ");
		
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		
		long startTime = 0, endTime = 0;
		
		if (in.equals("s")) {
			
			System.out.println("Stop watch started");

			
			startTime = System.currentTimeMillis();
			
			System.out.println("Enter 'e' to start the stop watch : ");
			in = sc.nextLine();
			if (in.equals("e")) {
				System.out.println("Stop watch ended");

				endTime = System.currentTimeMillis();

				long timeDifference = endTime - startTime;

				int hh = (int) timeDifference / (1000 * 60 * 60);
				int mm = (int) timeDifference / (1000 * 60);
				int ss = (int) timeDifference / 1000;
				int ms = (int) timeDifference % 1000;

				System.out.println(hh + ":" + mm + ":" + ss + ":" + ms);
				
			} else {
				System.out.println("Invalid input");
				} 
		}else {
				System.out.println("Invalid input");
			}
				sc.close();
			
			}

	}
			
			

