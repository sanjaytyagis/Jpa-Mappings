package com.example.jpamapping.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	Employee getById(int id);

}
