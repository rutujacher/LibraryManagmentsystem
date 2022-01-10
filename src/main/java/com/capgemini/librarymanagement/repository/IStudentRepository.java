package com.capgemini.librarymanagement.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagement.entity.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {
	@Query("from Student where stud_email=?1 and stud_password=?2")
	List<Student> findByLogin(String stud_email,String stud_password);
	
	Student findById(int stud_id);
	
	@Query("from Student where stud_email=?1")
	List<Student> findByEmail(String stud_email);
	

}
