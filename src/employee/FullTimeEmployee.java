package employee;

import hr_interface.Payable;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: FullTimeEmployee
 * Language: Java
 * Date: 11/17/17
 * Description: This class contains attributes related to a full-time employee and an abstract algorithm to calculate their salary.
 */

// This class has attributes related to a full-time employee and implements the interface Payable to calculate their salary
public class FullTimeEmployee implements Payable 
{
	// Instance variables
	private double baseSalary;																		// Full-time employee's base salary
	private double bonus;																			// Full-time employee's bonus money 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Base Salary, Bonus 
	public FullTimeEmployee(double baseSalary, double bonus)
	{
		// Instantiate properties
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
// ------------------- End Alternate Constructor -------------------

// ------------------- Calculate Payroll Method -------------------
	// Method that calculates the full-time employee's salary that includes a bonus
	// Override Payable's method  
	@Override
	public void calcPayroll()
	{
		// Local variables 
		double totalSal;																			// Total salary
		
		totalSal = baseSalary + bonus;																// Calculate full-time employee's salary
		String fTotalSal = String.format("%.2f", totalSal);											// Format salary to two decimal places 
		System.out.println("Full-time employee's payroll: $" + fTotalSal);							// Print out full-time employee's salary
	} 
// ------------------- End Calculate Payroll Method -------------------
} // End of class FullTimeEmployee
