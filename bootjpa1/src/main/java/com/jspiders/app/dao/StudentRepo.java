package com.jspiders.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.jspiders.app.model.StudentModel;

public interface StudentRepo extends CrudRepository<StudentModel, Integer>{

}
