package com.example.jpamapping.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer>{

	Project getById(int id);

}
