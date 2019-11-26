package com.example.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Repository.EmployeeRepository;
import com.example.Service.EmployeeService;
import com.example.model.EmployeeModel;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeRepository empRepo = (EmployeeRepository)context.getBean("employee");
		empRepo.add(employeeModel);
		
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setEmployeeId(1);
		employeeModel.setEmployeeName("Upendra");
		employeeModel.setExperience(2);
		employeeModel.setSalary(30000);
		
		EmployeeService empService = new EmployeeService();
		empService.AddEmployee(employeeModel);
		
		

	}

}
