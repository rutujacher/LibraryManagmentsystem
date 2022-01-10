package com.capgemini.librarymanagement.repository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.librarymanagement.entity.Returnbook;

public interface IReturnBookRepository extends CrudRepository<Returnbook,Integer>{

}
