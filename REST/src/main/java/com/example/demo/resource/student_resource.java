package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Response;
import com.example.demo.model.Teacher;
import com.example.demo.model.student;
import com.example.demo.repository.TeacherRepo;
import com.example.demo.repository.student_repo;

@Controller
//@RequestMapping("students")
public class student_resource 
{

	@Autowired
	student_repo s;
	
	@Autowired
	TeacherRepo t; 
	
	 
	
	@RequestMapping("home")
	public String home() {
		return "main.jsp";
	}
	
	@RequestMapping("add")
	public String add() {
		return "adding.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(student s1) {
		s.save(s1);
		Response r1 = new Response();
		r1.setReturnCode(200);
		r1.setReturnMessage("Done Successfully");
		r1.setReturnData(s1);
		r1.setReturnType("SUCCESS");
		return "add.jsp";
			
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "edit.jsp";
	}
	
	@RequestMapping("/update")
	public String updateStudent(student s1) {
		int id = s1.getId();
		if(s.findById(id).isPresent()) {
		student newStudent = s.findById(s1.getId()).orElse(null);
		newStudent.setName(s1.getName());
		newStudent.setPosition(s1.getPosition());
		s.save(newStudent);
		return "add.jsp";
		}
		else
			return "error.jsp";
	}
	
	@RequestMapping("search")
	public String search() {
		return "search.jsp";
	}
	
	@RequestMapping("/searching")
	public ModelAndView search(int id) {
		ModelAndView model = new ModelAndView("show.jsp");
		ModelAndView m = new ModelAndView("error.jsp");
		if(s.findById(id).isPresent()) {
			model.addObject("student", s.findById(id));
			return model;
		}
		else
			return m;
	}
	
	@RequestMapping("deleteRecord")
	public String deleting() {
		return "deleting.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(int id) {
		if(s.findById(id).isPresent()) {
			s.deleteById(id);
			return "delete.jsp";
		}
		else
			return "error.jsp";
	}
	
//	@RequestMapping("/updateStudent")
//	public String updateStudent(int id) {
//		if(s.findById(id).isPresent()) {
//			return "edit.jsp";
//		}
//		else
//			return "error.jsp";
//	}
	
	
//	//@RequestMapping(method=RequestMethod.POST)
//	@PostMapping("/students")
//	public List<student> getAll(){
//		return s.findAll();
//	}
//	
//	@PostMapping("/teachers")
//	public List<Teacher> getAllTeachers(){
//		return t.findAll();
//	}

//	@PostMapping("get/{id}")
//	public student getStudent(@PathVariable int id) {
//		return s.findById(id).orElse(null);
//	}
//	
//	@PostMapping("getTeacher/{id}")
//	public Teacher getTeacher(@PathVariable int id) {
//		return t.findById(id).orElse(null);
//	}
//
//	@PostMapping("/del/{id}")
//	public String deleteStudent(@PathVariable int id) {
//		s.deleteById(id);
//		return "Record Deleted of Student with id: "+id;
//	}
//	
//	@PostMapping("/delTeacher/{id}")
//	public String deleteTeacher(@PathVariable int id) {
//		t.deleteById(id);
//		return "Record Deleted of Teacher with id: "+id;
//	}
	
//	//@RequestMapping(method=RequestMethod.PUT)
	
	
//	@PostMapping("/updateTeacher")
//	public String updateTeacher(@RequestBody Teacher t1) {
//		int id = t1.getTch_id();
//		if(t.findById(id).isPresent()) {
//		Teacher newTeacher = t.findById(t1.getTch_id()).orElse(null);
//		newTeacher.setTch_Name(t1.getTch_Name());
//		newTeacher.setTch_Salary(t1.getTch_Salary());
//		t.save(newTeacher);
//		return "String updated for Teacher id: "+id;
//		}
//		else
//			return "No record found for Teacher id: "+id;
//	}
//			
//	//@RequestMapping(method=RequestMethod.POST)
//	
//	@PostMapping("/addTeacher")
//	public Teacher createTeacher(@RequestBody Teacher t1) {
//		return t.save(t1);
//	}
	
}
