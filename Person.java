2 Create a class Person and implement Serializable ,

personId
personName
personAge
personLocation
....
get()... set()

package com.yash.Interface;
import java.io.Serializable;  

public class Person implements Serializable {
	
	
	private int personId;
	private String personName;
	private int personAge;
	private String personLocation;
	
	
	
	public Person(int personId, String personName, int personAge, String personLocation) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personLocation = personLocation;
	}



	

	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public int getPersonAge() {
		return personAge;
	}


	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}


	public String getPersonLocation() {
		return personLocation;
	}


	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person per = new Person();
//		per.setPersonName("Ak");
//		System.out.println(per.getPersonName());
		

	}

}


