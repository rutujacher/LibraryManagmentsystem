package com.capgemini.librarymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.librarymanagement.entity.Librarian;


public interface ILibrarianRepository extends CrudRepository<Librarian,Integer> {
	//librarian login
	@Query("from Librarian where lemail=?1 and lpassword=?2")
	List<Librarian> findByLogin(String lemail,String lpassword);
	
	//edit librarian
	
	Librarian findById(int lid);


}
