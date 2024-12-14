package com.tns.ifet.assignment1;
import com.tns.ifet.assignment1.employees.*;
import com.tns.ifet.assignment1.utilities.*;
public class AssignmentMain
{
	public static void main(String[] args)
	{
		Manager manager = new Manager("Anandha Baskar", 301, 78000, "HR");
		Developer developer = new Developer("Arun Kumar", 302, 56000, "JAVA");
		EmployeeUtilities.printEmployeeDetails(manager);
		EmployeeUtilities.printEmployeeDetails(developer);
		

	}
}
