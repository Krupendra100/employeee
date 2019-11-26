package com.example.Repository;

import org.springframework.stereotype.Repository;


import com.example.model.EmployeeModel;
@Repository
public interface EmployeeRepository {
	

	void add(EmployeeModel employeeModel);

	
}
