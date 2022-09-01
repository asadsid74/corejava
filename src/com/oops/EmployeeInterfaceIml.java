package com.oops;

public class EmployeeInterfaceIml implements EmployeeInterface{
public static void main(String[] args) {
	EmployeeInterfaceIml interfaceIml = new EmployeeInterfaceIml();
	
	interfaceIml.getEmployeename("asad");
	
}

@Override
public String getEmployeename(String e_name) {
	System.out.println("asad"); 
	return e_name;
}
}
