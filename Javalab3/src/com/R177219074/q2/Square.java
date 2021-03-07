package com.R177219074.q2;
import java.util.Scanner;
import java.lang.Math;

public class Square {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int arr2[]=new int[10];
		 int x=arr2.length,sum=0;
		 System.out.println("Enter numbers:");
		 for(int i=0;i<x;i++){
			 arr2[i]=sc.nextInt();
			System.out.println("Square of "+arr2[i]+"  is: "+(int)(Math.pow(arr2[i], 2)));
		     sum= (int) (sum + Math.pow(arr2[i], 2));
		 }
		 System.out.println("Sum of Squares is:"+sum);
		 sc.close();

	}

}
