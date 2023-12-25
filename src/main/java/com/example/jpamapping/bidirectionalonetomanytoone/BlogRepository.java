package com.example.jpamapping.bidirectionalonetomanytoone;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, Integer>{

	public Blog getById(int id);
}
