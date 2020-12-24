/**
 * 
 */
package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

/**
 * @Sai Kumar Naidu (51897496)
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.dao.StudentDao#getById(int)
	 */
	@Override
	public Student getById(int id) {
		
		Student student = new Student();
		Session session = sessionFactory.getCurrentSession();
		String hql= "FROM Student student WHERE student.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		 student = (Student) query.uniqueResult();
		
		return student;
	}

	/* (non-Javadoc)
	 * @see com.dao.StudentDao#saveStudent(com.model.Student)
	 */
	@Override
	public Student saveStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.save(student);	
		return student;
	}

	/* (non-Javadoc)
	 * @see com.dao.StudentDao#deleteById(int)
	 */
	@Override
	public Student deleteById(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(student);
		return null;
	}

}
