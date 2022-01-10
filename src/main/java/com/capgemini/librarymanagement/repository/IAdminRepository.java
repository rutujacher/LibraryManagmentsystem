package com.capgemini.librarymanagement.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagement.entity.Admin;

@Repository
public interface IAdminRepository extends CrudRepository<Admin,Integer>{
//List<Admin> findByAdminName(String adminName);
	
	@Query("from Admin where aName=?1 and aPassword=?2")
	List<Admin> findByLogin(String AName,String APassword);

	

}
