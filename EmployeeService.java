package com.example.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.model.EmployeeModel;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void AddEmployee(EmployeeModel employeeModel) {
		
		employeeRepo.add(employeeModel);
		
		
	}

}
