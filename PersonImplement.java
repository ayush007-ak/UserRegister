package com.yash.Interface;
import java.io.*;  

public class PersonImplement {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Person per = new Person(233,"ayush",24,"India");
			  FileOutputStream fout=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(per);
			  out.flush();
			  out.close();
			  System.out.println("Success");
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
