package com.capgemini.librarymanagement.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.capgemini.librarymanagement.entity.Issuebook;
//import com.capgemini.librarymanagement.entity.Student;

public interface IIssueBookRepository extends CrudRepository<Issuebook,Integer>{
	Issuebook findById(int book_id);
	@Query("from Issuebook where stud_id=?1")
	List<Issuebook> findByStudId(int stud_id);
	

}
