package com.departments.tech;

import com.departments.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	@Override
	public String departmentName() {
		return "Tech Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	@Override
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
	public String getTechStackInformation() {
		return "core java";
	}
}
