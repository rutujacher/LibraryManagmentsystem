package com.capgemini.librarymanagement.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagement.entity.Book;
import com.capgemini.librarymanagement.entity.Issuebook;
import com.capgemini.librarymanagement.entity.Librarian;
import com.capgemini.librarymanagement.entity.Returnbook;
import com.capgemini.librarymanagement.entity.Student;
//import com.capgemini.librarymanagement.entity.Student;
import com.capgemini.librarymanagement.repository.IBookRepository;
import com.capgemini.librarymanagement.repository.IIssueBookRepository;
import com.capgemini.librarymanagement.repository.ILibrarianRepository;
import com.capgemini.librarymanagement.repository.IReturnBookRepository;
import com.capgemini.librarymanagement.repository.IStudentRepository;
@Service
public class ILibrarianService {
	@Autowired
	ILibrarianRepository librarianRepository;
	public String loginLibrarian(String lemail,String lpassword)
	{
		List<Librarian> librarianList=librarianRepository.findByLogin(lemail, lpassword);
		if(librarianList.size()==1)
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	
	//add book
	@Autowired
	IBookRepository bookRepository;
	public void addBook(Book book)
	{
		//Librarian librarian=new Librarian();
		bookRepository.save(book);
	}
	
	//view Book
	public List<Book> viewBook()
	{
		List<Book> bookList=(List<Book>) bookRepository.findAll();
		return bookList;
		
	}
	
	//issue book
	@Autowired
	IIssueBookRepository issueBookRepository;
	public void issueBook(int book_id,int stud_id,Date issue_date)
	{
		Issuebook issueBook=new Issuebook();
		issueBook.setBook_id(book_id);
		issueBook.setStud_id(stud_id);
		issueBook.setIssue_date(issue_date);
		issueBook.setReturn_status("No");
		issueBookRepository.save(issueBook);
		
	}
	
	//update issue book count in book table after issue book
	
	public void editBook(int book_id)
	{
		Book book=bookRepository.findById(book_id);
		int issuebookcount=book.getBook_issued();
		issuebookcount=issuebookcount+1;
		book.setBook_issued(issuebookcount);
		bookRepository.save(book);
	}
	
	//return book
	@Autowired
	IReturnBookRepository returnBookRepository;
	public void returnBook(int book_id,int stud_id,Date return_date)
	{
		Returnbook returnBook=new Returnbook();
		returnBook.setBook_id(book_id);
		returnBook.setStud_id(stud_id);
		returnBook.setReturn_date(return_date);
		returnBookRepository.save(returnBook);
		
	}
	
	//update issue book count in book table after return book
	
		public void editBooks(int book_id)
		{
			Book book=bookRepository.findById(book_id);
			int issuecount=book.getBook_issued();
			issuecount=issuecount-1;
			book.setBook_issued(issuecount);
			bookRepository.save(book);
		}
		
		//update return status of book after return book
			public void editReturnStatus(int book_id)
			{
				Issuebook issueBook=issueBookRepository.findById(book_id);
				issueBook.setReturn_status("Yes");
				issueBookRepository.save(issueBook);
			}
				
			
	//view issued books
			public List<Issuebook> viewIssueBook()
			{
				List<Issuebook> issueBookList=(List<Issuebook>) issueBookRepository.findAll();
				return issueBookList;
				
			}
		//delete book
			public void deleteBook(int book_id)
			{
				bookRepository.deleteById(book_id);
			}
			
		
		


}
