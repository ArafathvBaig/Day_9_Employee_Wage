package com.Day_9_Employee_Wage;

public class EmployeeWage 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	int totalWorkingHrs = 0;
	int totalWorkingDays = 0;
	int empHrs = 0;
	int dailyWage;
	int totalWage;
	int empCheck;
	
	/*
	 * Here in this method we are taking different parameters from main
	 * then applying limitations through while loop 
	 */
	
	public void limitations(int EMP_RATE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HOURS)
	{
		while((totalWorkingHrs<=MAX_WORKING_HOURS) && (totalWorkingDays<=MAX_WORKING_DAYS))
		{
			
			empCheck =(int) ((Math.random())*10)%3;
			switch(empCheck)
			{
			case IS_FULL_TIME:
				empHrs = 8;
				totalWorkingHrs=totalWorkingHrs+empHrs;
				totalWorkingDays++;
				if((totalWorkingHrs<=MAX_WORKING_HOURS) && (totalWorkingDays<=MAX_WORKING_DAYS))
				{
					System.out.println("Randome Check is: "+empCheck);
					System.out.println("Total Working Hours = "+totalWorkingHrs);
					System.out.println("Day = "+totalWorkingDays);
					dailyWage = empHrs*EMP_RATE_PER_HR;
					System.out.println("Employee Daily Wage is: "+dailyWage);
					totalWage = totalWorkingHrs*EMP_RATE_PER_HR;
					System.out.println("Total Wage is: "+totalWage);
					System.out.println(" ");
				}
				break;
				
			case IS_PART_TIME:
				empHrs = 4;
				totalWorkingHrs=totalWorkingHrs+empHrs;
				totalWorkingDays++;
				if((totalWorkingHrs<=MAX_WORKING_HOURS) && (totalWorkingDays<=MAX_WORKING_DAYS))
				{
					System.out.println("Randome Check is: "+empCheck);
					System.out.println("Total Working Hours = "+totalWorkingHrs);
					System.out.println("Day = "+totalWorkingDays);
					dailyWage = empHrs*EMP_RATE_PER_HR;
					System.out.println("Employee Daily Wage is: "+dailyWage);
					totalWage = totalWorkingHrs*EMP_RATE_PER_HR;
					System.out.println("Total Wage is: "+totalWage);
					System.out.println(" ");
				}
				break;
				
			default:
				empHrs=0;
				totalWorkingHrs=totalWorkingHrs+empHrs;
				totalWorkingDays++;
				if((totalWorkingHrs<=MAX_WORKING_HOURS) && (totalWorkingDays<=MAX_WORKING_DAYS))
				{
					System.out.println("Randome Check is: "+empCheck);
					System.out.println("Total Working Hours = "+totalWorkingHrs);
					System.out.println("Day = "+totalWorkingDays);
					dailyWage = empHrs*EMP_RATE_PER_HR;
					System.out.println("Employee Daily Wage is: "+dailyWage);
					totalWage = totalWorkingHrs*EMP_RATE_PER_HR;
					System.out.println("Total Wage is: "+totalWage);
					System.out.println(" ");
				}
				break;
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Company-1");
		EmployeeWage obj1=new EmployeeWage();
		obj1.limitations(20, 20, 100);
		System.out.println("Company-2");
		EmployeeWage obj2=new EmployeeWage();
		obj2.limitations(18, 22, 80);
		System.out.println("Company-3");
		EmployeeWage obj3=new EmployeeWage();
		obj3.limitations(22, 26, 120);
	}
}
