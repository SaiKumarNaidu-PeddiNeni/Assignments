/**
 * 
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */


@RestController
public class FirstController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/")
	public String message()
	{
		return "Hello RESTful web services";
	}
	
	@GetMapping(value="/getStudent/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getById(id);	
	}
	
	@PostMapping(value="/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping(value="/deleteStudent")
	public Student deleteStudent(@RequestBody Student student)
	{
		return studentService.deleteById(student);
	}
	
}
