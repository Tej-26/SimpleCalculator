package com.example;

import java.util.Scanner;

public class SimpleCalculator {
public int add(int a,int b) {
		
		int sum=0;
		sum=a+b;
		return sum;
	}
	 public int multi(int a,int b) 
	 {
		int multi=0;
		multi=a*b;
		return multi;
	}
	public int sub(int a,int b) 
	{
		int sub=0;
		sub=a-b;
		return sub;
	}
	 public float div(int a,int b) 
	 {
		float div=0;
		div=a/b;
		return div;
	}
	public int mod(int a,int b) 
	{
		int mod=0;
		mod=a%b;
		return mod;
	}
	public static void main(String[] args) {
		int num1;
	      int num2;
	      int ans;
	      
	      SimpleCalculator sc=new SimpleCalculator();
	      Scanner reader = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = reader.nextInt();
	      num2 = reader.nextInt();
	      System.out.print("\nEnter 1.Add ,2.Sub,3.div,4.multi,5.mod");
	       int op = reader.nextInt();
	      switch(op) {
	         case 1: ans=sc.add(num1,num2);
	         System.out.println(ans);
	            break;
	         case 2: ans=sc.sub(num1, num2);
	         System.out.println(ans);
	            break;
	         case 3: float ans1=sc.div(num1, num2);
	         System.out.println(ans1);
	            break;
	         case 4: ans=sc.multi(num1, num2);
	         System.out.println(ans);
	            break;
	         case 5: ans=sc.mod(num1, num2);
	         System.out.println(ans);
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      //System.out.print("\nThe result is given as follows:\n");
	      //System.out.printf(num1 + " " + op1 + " " + num2 + " = " + ans);
	   }
	

	}


