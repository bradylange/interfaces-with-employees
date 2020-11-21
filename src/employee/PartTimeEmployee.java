package employee;

import hr_interface.Payable;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: PartTimeEmployee
 * Language: Java
 * Date: 11/17/17
 * Description: This class contains attributes related to a part-time employee and an abstract algorithm to calculate their salary.
 */

// This class has attributes related to a part-time employee and implements the interface Payable to calculate their salary
public class PartTimeEmployee implements Payable 
{
	// Instance variables
	private int workingHours;															// Part-time employee's hours worked 
	private double paymentPerHour;														// Part-time employee's payment per hour 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Hours Worked, Payment Per Hour 
	public PartTimeEmployee(int workingHours, double paymentPerHour)
	{
		// Instantiate properties with parameter values 
		this.workingHours = workingHours;
		this.paymentPerHour = paymentPerHour;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Calculate Payroll Method -------------------
	// Method that calculates the part-time employees payroll
	@Override
	public void calcPayroll()
	{
		// Local variables
		double totalSal;																// Part-time employee's total salary
		
		totalSal = workingHours * paymentPerHour;										// Calculate part-time employee's total salary
		String fTotalSal = String.format("%.2f", totalSal);								// Format the total salary to two decimal places 	
		System.out.println("Part-time employee's payroll: $" + fTotalSal);				// Print total salary
	} 
// ------------------- End Calculate Payroll Method -------------------
} // End of class PartTimeEmployee
