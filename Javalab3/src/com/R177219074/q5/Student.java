package com.R177219074.q5;
import java.util.Scanner;
public class Student {
     public static void main(String[] args) {
              Scanner sc = new Scanner(System.in) ;
              int stu[]= new int[10];
              int index[]=new int[10];
              for(int i=0;i<10;i++) {
            	  System.out.println("Enter marks of Student:"+(i+1));
            	  stu[i]=sc.nextInt();
            	  index[i]=i;
              }
              int n = stu.length;  
              int temp = 0;
              int temp1=0;  
               for(int i=0; i < n; i++){  
                       for(int j=1; j < (n-i); j++){  
                                if(stu[j-1] > stu[j]){  
                                       //swap elements  
                                       temp = stu[j-1];  
                                       stu[j-1] = stu[j];  
                                       stu[j] = temp;  
                                       temp1 = index[j-1];  
                                       index[j-1] = index[j];  
                                       index[j] = temp1;       
                               }  
                        }
               }
               for(int i=0;i<10;i++) {
            	  if (stu[i]>39 & stu[i]<51) 
            		 System.out.println("Grade of Student "+(index[i]+1)+" is : PASS");
            		 
            	  else if(stu[i]>50 & stu[i]<76) 
            		 System.out.println("Grade of Student "+(index[i]+1)+" is ::  MERIT");
            		             	  
            	  else if(stu[i]>75 & stu[i]<101) 
            		 System.out.println("Grade of Student "+(index[i]+1)+" is : :  Distinction");
           }
              sc.close();
	}
     }
