/**
 * 
 */
package com.dao;

import com.model.Student;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
public interface StudentDao {
	
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

}
