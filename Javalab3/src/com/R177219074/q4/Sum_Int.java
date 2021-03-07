package com.R177219074.q4;
import java.util.Scanner;
public class Sum_Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		for(int i=40;i<250;i++) {
			if(i%5 == 0) {
				sum +=i;
			}
		}
		System.out.println("Sum of all integers B/w 40 and 250 divisible by 5 is: \n"+sum);
		sc.close();

	}

}