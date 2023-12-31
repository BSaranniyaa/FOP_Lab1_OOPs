package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateEmailID(String fname, String lname, String deptName) {
		// TODO Auto-generated method stub
		return fname+lname+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String cpas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//26
		String lower = "abcdefghijklmnopqrstuvwxyz";//26
		String nums = "0123456789";//10
		String splchars= "!@#$%&*";//10
		
		String combined = cpas+lower+nums+splchars;
 		String myPass="";
		Random random = new Random();
 		for (int i=1; i<=8; i++)
 		{
 		myPass=myPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
 		}
		return myPass;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Employee First Name is:"+ e.getFname());
		System.out.println("Employee Last Name is:"+ e.getLname());
		System.out.println("Employee Email Name is:"+ e.getEmail());
		System.out.println("Employee Password Name is:"+ e.getPasword());
		
	}

}
