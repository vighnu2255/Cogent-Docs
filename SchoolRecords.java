package com.cogent.assessment.copy;

public class SchoolRecords {
	
	String name;
	int id;
	String address;
	
	public void setName(String newName) {
		name = newName;
	}
	public void setId(int newId) {
		id = newId;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	
	public void dispRecords() {
		System.out.println("Record: " + name + ", " + address + " with id: " + id + " has been displayed");
	}
	
	public static void main(String[] args) {
		
		SchoolRecords s1 = new SchoolRecords();
		s1.setName("Georgia State University");
		s1.setId(10);
		s1.setAddress("33 Gilmer Street");
		
		s1.dispRecords();
		
	}

}
