package com.greatlearning.main;
import com.greatlearning.departments.superDepartment;
import com.greatlearning.departments.adminDepartment;
import com.greatlearning.departments.hrDepartment;
import com.greatlearning.departments.techDepartment;

public class driver {

	public static void main(String[] args) {
		
		
			adminDepartment ad=new adminDepartment();						
			System.out.println("Welcome to "+ad.departmentName());			
			System.out.println(ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
			System.out.println(ad.isTodayAHoliday());
			System.out.println();
			
			
			hrDepartment hr=new hrDepartment();								
			System.out.println("Welcome to "+hr.departmentName());			
			System.out.println(hr.doActivity());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.isTodayAHoliday());
			System.out.println();
			
			techDepartment td=new techDepartment();							
			System.out.println("Welcome to "+td.departmentName());			
			System.out.println(td.getTodaysWork());
			System.out.println(td.getWorkDeadline());
			System.out.println(td.getTechStackInformation());
			System.out.println(td.isTodayAHoliday());
		
	


	}
	
}	


