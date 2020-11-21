package employee_application;


import employee.FullTimeEmployee;
import employee.FullTimePermanentEmployee;
import employee.InternEmployee;
import employee.PartTimeEmployee;
import hr_interface.Payable;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: EmployeeApplication
 * Language: Java
 * Date: 11/17/17
 * Description: This program tests the functionality of the employee classes using an interface.
 */

// This class contains the program to test the employee classes
public class EmployeeApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		System.out.println("***************************************** Employee's Payroll's: *******************************************");
		
		// Calculate full-time employee's payroll
		Payable ftEmployee_1 = new FullTimeEmployee(55000, 956);
		ftEmployee_1.calcPayroll();															
		
		// Calculate part-time employee's payroll
		Payable ptEmployee_1 = new PartTimeEmployee(40, 16.52);
		ptEmployee_1.calcPayroll();	
		
		// Calculate intern employee's payroll
		Payable internEmployee_1 = new InternEmployee(566);
		internEmployee_1.calcPayroll();
		
		// Calculate permanent full-time employee's payroll and the amount of accumulated hours paid off they have total
		FullTimePermanentEmployee ftpEmployee_1 = new FullTimePermanentEmployee(76500, 2300, 10);
		ftpEmployee_1.calcPayroll();
		ftpEmployee_1.absencePay();
		System.out.println("*********************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class EmployeeApplication 
