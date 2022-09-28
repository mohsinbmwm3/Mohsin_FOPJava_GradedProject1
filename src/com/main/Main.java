package com.main;

import com.departments.admin.AdminDepartment;
import com.departments.hr.HrDepartment;
import com.departments.tech.TechDepartment;

public class Main {
	
	public static void main(String []args) {
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		// Printing details of admin department
		System.out.println(Main.getWelcomeString(admin.departmentName()));
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(Main.getWelcomeString(hrDepartment.departmentName()));
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(Main.getWelcomeString(techDepartment.departmentName()));
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
	}
	
	static String getWelcomeString(String departmentName) {
		return "Welcome " + departmentName;
	}
}
