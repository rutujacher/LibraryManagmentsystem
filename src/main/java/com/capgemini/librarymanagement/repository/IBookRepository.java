package com.capgemini.librarymanagement.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagement.entity.Book;
import com.capgemini.librarymanagement.entity.Librarian;

@Repository
public interface IBookRepository extends CrudRepository<Book,Integer> {
	Book findById(int book_id);


}
