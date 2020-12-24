/**
 * 
 */
package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.model.Student;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	/* (non-Javadoc)
	 * @see com.service.StudentService#getById(int)
	 */
	@Autowired
	private StudentDao studentDao;
	
	@Override
	@Transactional
	public Student getById(int id) {
		
		return studentDao.getById(id);
	}

	/* (non-Javadoc)
	 * @see com.service.StudentService#saveStudent(com.model.Student)
	 */
	@Override
	@Transactional
	public Student saveStudent(Student student) {
		
		return studentDao.saveStudent(student);
	}

	/* (non-Javadoc)
	 * @see com.service.StudentService#deleteById(int)
	 */
	@Override
	@Transactional
	public Student deleteById(Student student) {
		
		return studentDao.deleteById(student);
	}

}
