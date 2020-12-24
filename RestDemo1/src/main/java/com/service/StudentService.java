/**
 * 
 */
package com.service;

import com.model.Student;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
public interface StudentService {
	
	public abstract Student getById(int id);

	/**
	 * @param student
	 * @return
	 */
	public abstract Student saveStudent(Student student);

	/**
	 * @param id
	 * @return
	 */
	public abstract Student deleteById(Student student);

	/**
	 * @param student
	 * @return
	 */
	

}
