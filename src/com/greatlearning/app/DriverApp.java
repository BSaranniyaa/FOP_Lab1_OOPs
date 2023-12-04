package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EmployeeServiceImpl empImpl = new EmployeeServiceImpl();
		  Scanner sc = new Scanner(System.in);

		    System.out.println("Please enter your First Name");
		    String firstName = sc.next();
		    System.out.println("Please enter your Last Name");
		    String lastName =sc.next();

		    
            System.out.println("Technical");
            System.out.println("Admin");
            System.out.println("Human Resource");
            System.out.println("Legal");
		    
		    System.out.println("Please enter the department from the following");
		    int choice = sc.nextInt();
		    
		    String genEmail="";
		    String genPassword="";
		    switch(choice){
		    
		    case 1:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "tech"); break;
		    case 2:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "admin"); break;
		    case 3:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "hr"); break;
		    case 4:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "legal"); break;
		    default: System.out.println("Please enter valid input");
		    }
		
		   //System.out.println(genEmail);
		   genPassword=empImpl.generatePassword();
		   Employee e1 = new Employee();
		   e1.setFname(firstName);
		   e1.setLname(lastName);
		   e1.setEmail(genEmail);
		   e1.setPasword(genPassword);
		   
		   empImpl.showEmployeeDetails(e1);
		   
	}
	

}
