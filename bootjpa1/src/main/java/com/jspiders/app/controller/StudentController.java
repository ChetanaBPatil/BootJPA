package com.jspiders.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.app.dao.StudentRepo;
import com.jspiders.app.model.StudentModel;

@Controller
public class StudentController {
	@Autowired
	private StudentRepo repo;
	
	@RequestMapping("Student")
	public ModelAndView enter()
	{
		ModelAndView model=new ModelAndView("StudentForm");
		return model;
	}
	@RequestMapping
	public ModelAndView addStudent(StudentModel student)
	{
		repo.save(student);
		ModelAndView model=new ModelAndView("studentsucess");
		return model;
		
		
		
	}

}
