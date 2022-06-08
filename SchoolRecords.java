package com.cogent.assessment.copy;

public class SchoolRecords {
	
	String name;
	int id;
	String address;
	
	public void addRecords() {
		System.out.println("Record" + name + ", " + address + " with " + id + " have been added");
	}
	
	public void dispRecords() {
		System.out.println("Record" + name + ", " + address + " with " + id + " has been displayed");
	}
	
	public static void main(String[] args) {
		
		SchoolRecords s1 = new SchoolRecords();
		s1.name = "Georgia State University";
		s1.id = 5;
		s1.address = "33 Gilmer Street";
		
		s1.addRecords();
		s1.dispRecords();
		
	}

}
