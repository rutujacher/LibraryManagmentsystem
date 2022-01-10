package com.capgemini.librarymanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagement.entity.Admin;
import com.capgemini.librarymanagement.entity.Librarian;
import com.capgemini.librarymanagement.entity.Student;
import com.capgemini.librarymanagement.repository.IAdminRepository;
import com.capgemini.librarymanagement.repository.ILibrarianRepository;
import com.capgemini.librarymanagement.repository.IStudentRepository;

@Service
public class IAdminService {
	//Admin login
	@Autowired
	IAdminRepository adminRepository;
	public String loginAdmin(String AName,String APassword)
	{
		List<Admin> adminList=adminRepository.findByLogin(AName, APassword);
		if(adminList.size()==1)
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	
	//add Librarian
	@Autowired
	ILibrarianRepository librarianRepository;
	public void addLibrarian(Librarian librarian)
	{
		//Librarian librarian=new Librarian();
		librarianRepository.save(librarian);
	}
	
	
	//add student
	@Autowired
	IStudentRepository studentRepository;
	public void addStudent(Student student)
	{
		//Librarian librarian=new Librarian();
		studentRepository.save(student);
	}
	
	//view librarian
	public List<Librarian> viewLibrarian()
	{
		List<Librarian> librarianList=(List<Librarian>) librarianRepository.findAll();
		return librarianList;
		
	}
	
	//view Student
	public List<Student> viewStudent()
	{
		List<Student> studentList=(List<Student>) studentRepository.findAll();
		return studentList;
		
	}
	
	/*edit librarian
		public Librarian UpdateUser(Librarian librarian)
		{
			Librarian l=librarianRepository.findById(librarian.lid());
			librarianRepository.save(l);
			return l;
		}
*/
	//edit librarian
	public void editLibrarian(int lid,String lname,String lemail,String lpassword,String lcontact)
	{
		Librarian l=librarianRepository.findById(lid);
		l.setLname(lname);
		l.setLemail(lemail);
		l.setLpassword(lpassword);
		l.setLcontact(lcontact);
		librarianRepository.save(l);
	}
	
	//delete librarian
	
	public void deleteLibrarian(int lid)
	{
		//Librarian lib=librarianRepository.findById(lid);
		librarianRepository.deleteById(lid);
	
	}
	
	//edit student
	public void editStudent(int stud_id,String stud_enrollment,String stud_name,String stud_email,String stud_password,String stud_contact)
	{
		Student student=studentRepository.findById(stud_id);
		student.setStud_enrollment(stud_enrollment);
		student.setStud_name(stud_name);
		student.setStud_email(stud_email);
		student.setStud_password(stud_password);
		student.setStud_contact(stud_contact);
		studentRepository.save(student);
		
	}
	
	//delete student
	public void deleteStudent(int stud_id)
	{
		studentRepository.deleteById(stud_id);
	
	}
	
	



	
	

}
