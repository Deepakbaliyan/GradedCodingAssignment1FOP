package com.greatlearning.groupAssignment;
import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;


public class Driver {
	
	    public static void main(String[] args) {
	        AdminDepartment admin = new AdminDepartment();
	        HrDepartment hr = new HrDepartment();
	        TechDepartment tech = new TechDepartment();

	        // Display Admin Department functionalities
	        System.out.println("Welcome to " + admin.departmentName());
	        System.out.println(admin.getTodaysWork());
	        System.out.println(admin.getWorkDeadline());
	        System.out.println(admin.isTodayAHoliday());

	        // Display HR Department functionalities
	        System.out.println("\nWelcome to " + hr.departmentName());
	        System.out.println(hr.doActivity("team Lunch"));
	        System.out.println(hr.getTodaysWork());
	        System.out.println(hr.getWorkDeadline());
	        System.out.println(hr.isTodayAHoliday());

	        // Display Tech Department functionalities
	        System.out.println("\nWelcome to " + tech.departmentName());
	        System.out.println(tech.getTodaysWork());
	        System.out.println(tech.getWorkDeadline());
	        System.out.println(tech.getTechStackInformation());
	        System.out.println(tech.isTodayAHoliday());
	    }
	
}