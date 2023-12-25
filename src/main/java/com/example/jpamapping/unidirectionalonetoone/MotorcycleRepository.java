package com.example.jpamapping.unidirectionalonetoone;

import org.springframework.data.repository.CrudRepository;

public interface MotorcycleRepository extends CrudRepository<Motorcycle, Integer>{

	public Motorcycle findById(int id);
}
