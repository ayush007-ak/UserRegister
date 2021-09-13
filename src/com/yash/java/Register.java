package com.yash.java;
import java.util.Scanner;

public class Register {
	
	public static void main(String[] args) {
		//System.out.println("Enter name of Student");
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
	
		int age = sc.nextInt();
		
		String Address = sc.nextLine();
		
		int rollno = sc.nextInt();
		
		System.out.println("name :"+ name);
        System.out.println("age :"+ age);
		System.out.println("Address :" + Address);
		System.out.println("rollno :" + rollno);

	}

}
