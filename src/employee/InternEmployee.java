package employee;

import hr_interface.Payable;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: InternEmployee
 * Language: Java
 * Date: 11/17/17
 * Description: This class contains attributes related to an intern employee and an abstract algorithm to calculate their salary.
 */

// This class has attributes related to an intern employee and implements the interface Payable to calculate their stipend
public class InternEmployee implements Payable 
{
	// Instance variables
	private double stipend;																	// Intern's salary
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Stipend
	public InternEmployee(double stipend)
	{
		// Instantiate properties with parameter values 
		this.stipend = stipend;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Calculate Payroll Method -------------------
	// Method that calculates the intern's stipend
	// Overrides Payable's method 
	@Override
	public void calcPayroll()
	{
		String fStipend = String.format("%.2f", stipend);									// Format the stipend to two decimal places
		System.out.println("Intern employee's payroll: $" + fStipend);						// Print the intern's stipend 
	} 
// ------------------- End Calculate Payroll Method -------------------
} // End of class InternEmployee
