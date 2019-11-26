package com.example.RepositoryImpl;

import java.util.HashMap;
import java.util.Map;

import com.example.Repository.EmployeeRepository;
import com.example.model.EmployeeModel;

public class RepositoryImpl implements EmployeeRepository {
	 Map<Integer,EmployeeModel> map = new HashMap<Integer,EmployeeModel>();

	@Override
	public void add(EmployeeModel employeeModel) {
		map.put(employeeModel.getEmployeeId(), employeeModel);
		
		
	}

}
