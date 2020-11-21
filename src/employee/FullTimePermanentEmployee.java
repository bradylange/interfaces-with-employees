package employee;

import hr_interface.PaidTimeOff;
import hr_interface.Payable;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: FullTimePermanentEmployee
 * Language: Java
 * Date: 11/17/17
 * Description: This class contains attributes relating to a full-time permanent employee and abstract algorithms to calculate their salary
 * and paid time off.
 */

// This class has attributes related to a full-time permanent employee and implements the interface Payable and PaidTimeOff to calculate their salary and time off pay
public class FullTimePermanentEmployee implements Payable, PaidTimeOff 
{
	// Instance variables
	private double baseSalary;															// Permanent full-time employee's base salary
	private double bonus;																// Permanent full-time employee's bonus money 
	private int yearsServed;															// Permanent full-time employee's experience
	private final int hours = 50;														// Permanent full-time hours multiplier to determine paid time off amount of hours
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Base Salary, Bonus, Years Served 
	public FullTimePermanentEmployee(double baseSalary, double bonus, int yearsServed)
	{
		// Instantiate properties with parameter values 
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.yearsServed = yearsServed;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Calculate Payroll Method -------------------
	// Method that calculates the full-time permanent employee's salary that includes a bonus
	// Overrides Payable's method 
	@Override
	public void calcPayroll() 
	{
		// Local variables
		double totalSal;																// Permanent full-time employee's total salary
		
		totalSal = baseSalary + bonus;													// Calculate permanent full-time employee's salary
		String fTotalSal = String.format("%.2f", totalSal);								// Format total salary to two decimal places 
		System.out.println("Full-time permanent employee's payroll: $" + fTotalSal);	// Print total salary
	}
// ------------------- End Calculate Payroll Method -------------------

// ------------------- Absence Pay Method -------------------
	// Method that calculates the time paid off that the full-time permanent employee has earned
	// Overrides PaidTimeOff's method 
	@Override
	public void absencePay() 
	{
		// Local variables
		double moneyOffPay;																// Hours for paid time off
		
		moneyOffPay = yearsServed * hours;												// Calculate hours paid time off 
		System.out.println("The full-time permanent employee has " 						// Print hours paid off time 
		+ (int)moneyOffPay + " hours off pay over the span of " + yearsServed + " years served.");
	}
// ------------------- End Absence Pay Method -------------------
} // End of class FullTimePermanentEmployee
