package com.R177219074.q3;
import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Month Number:");
		 int month=sc.nextInt();
		 switch(month) {
		 case 1: 
			     System.out.println("Input Month is January");
			     break;
		 case 2:
			     System.out.println("Input Month is February");;
		         break;
		 case 3:
			     System.out.println("Input Month is March");;
		         break;
		 case 4:
			 	System.out.println("Input Month is April");;
			 	break;
		 case 5:
			  	System.out.println("Input Month is May");;
			  	break;
		 case 6:
			 	System.out.println("Input Month is June");;
			 	break;
		 case 7:
			 	System.out.println("Input Month is July");;
			 	break;
		 case 8:
			 	System.out.println("Input Month is August");;
			 	break;
		 case 9:
			 	System.out.println("Input Month is September");;
			 	break;
		 case 10:
			 	System.out.println("Input Month is October");;
			 	break;
		 case 11:
			 	System.out.println("Input Month is November");;
		     	break;
		 case 12:
			 	System.out.println("Input Month is December");;
		     	break;
	    default:
	    	    System.out.println("Invalid Input");;
		        break;
				 }
		 sc.close();
	}
}
