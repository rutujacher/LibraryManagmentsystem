package com.capgemini.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagement.entity.Book;
import com.capgemini.librarymanagement.entity.Issuebook;
import com.capgemini.librarymanagement.entity.Student;
import com.capgemini.librarymanagement.repository.IBookRepository;
import com.capgemini.librarymanagement.repository.IIssueBookRepository;
import com.capgemini.librarymanagement.repository.IStudentRepository;

@Service
public class IstudentService {

	@Autowired
	IStudentRepository studentRepository;
	//student login
	public String loginStudent(String stud_email,String stud_password)
	{
		List<Student> studentList=studentRepository.findByLogin(stud_email, stud_password);
		if(studentList.size()==1)
		{
			return "success";
			
		}
		else
		{
			return "fail";
		}
	}
	@Autowired
	IBookRepository bookRepository;
	//view Book
		public List<Book> viewBooks()
		{
			List<Book> bookList=(List<Book>) bookRepository.findAll();
			return bookList;
			
		}
		
		//find by email
		public List<Student> viewStudent(String stud_email)
		{
			List<Student> slist=studentRepository.findByEmail(stud_email);
			return slist;
			
		}
		
	//view issued books
		@Autowired
		IIssueBookRepository issueBookRepository;
		public List<Issuebook> viewIssueBook(int stud_id)
		{
			List<Issuebook> issuebook=(List<Issuebook>) issueBookRepository.findByStudId(stud_id);
	        return issuebook;
		}

}
