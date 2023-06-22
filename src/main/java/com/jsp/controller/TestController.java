 package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

@Controller
public class TestController {
	@Autowired
	StudentServices services;
	@RequestMapping("/loadstudent")
	public ModelAndView loadStudent() {
		ModelAndView andView=new ModelAndView("savestudent.jsp");
		andView.addObject("student",new Student());
		return andView;
	}
	
	@RequestMapping("/savestudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		Student student2=services.saveStudent(student);
		if(student!=null) {
			ModelAndView andView=new ModelAndView("studenthome.jsp");
			andView.addObject("msg","Data Saved...");
			return andView;
		}
		else {
			ModelAndView andView=new ModelAndView("loadstudent");
			return andView;
		}
	}
	
	@RequestMapping("/displayall")
	public ModelAndView displayAll() {
		List<Student> list=services.getAll();
		if(list.size()>0) {
			ModelAndView andView=new ModelAndView("displaystudent.jsp");
			andView.addObject("list",list);
			return andView;
		}
		else {
			ModelAndView andView=new ModelAndView("studenthome.jsp");
			andView.addObject("msg","There is no saved data");
			return andView;
		}
	}
	
	@RequestMapping("/getbyidstudent")
	public ModelAndView getByIdStudent(@RequestParam int id) {
		Student student=services.getById(id);
		ModelAndView andView=new ModelAndView("updatestudent.jsp");
		andView.addObject("student",student);
		return andView;
	}
	
	@RequestMapping("/updatestudent")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		Student student2=services.updateStudent(student);
		ModelAndView andView=new ModelAndView("displayall");
		return andView;
	}
	
	
	@RequestMapping("/deletestud"
			+ "ent")
	public ModelAndView deleteStudent(@RequestParam int id) {
		Student student=services.deleteStudent(id);
		ModelAndView andView=new ModelAndView("displayall");
		return andView;  
	}
}
