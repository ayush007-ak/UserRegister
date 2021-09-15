
1.Create an interface with functionality of calculating simple interest,compound interest on principal amount based on given interest rates.

Provide implementation of these functionality in a class

package com.yash.Interface;


interface Abc{
	void show(int p ,  int r , int t); 
	void display(int p ,  int r , int t);
}

class Test implements Abc {
	public void show(int p ,  int r , int t) {
		System.out.println("Simple  Interest is:"+ p*r*t/100);
	}
	
	public void display(int p ,  int r , int t) {
		System.out.println("Cp is");
		System.out.println(p*Math.pow(1.0+r/100.0,t)-p);
	}
}

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Test();
		obj.show(23,30,40);
        obj.display(20, 30, 40);
	}

}
