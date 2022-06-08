package com.cogent.assessment.copy;

public class EmployeeManagement {
	
	public static void addRecord() {
		System.out.println("Record has been added");
	}
	
	public EmployeeManagement() {
		System.out.println("Record has been displayed");
	}
	
	public void deleteRecord() {
		System.out.println("Record has been deleted");
	}
	
	public static void main(String[] args) {
		
		EmployeeManagement e1 = new EmployeeManagement();
		
		EmployeeManagement.addRecord();
		e1.deleteRecord();
	}

}
