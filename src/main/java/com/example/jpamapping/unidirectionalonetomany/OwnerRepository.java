package com.example.jpamapping.unidirectionalonetomany;

import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Integer>{

	public Owner getById(int id);
}
