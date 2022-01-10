package com.capgemini.librarymanagement.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.librarymanagement.entity.Book;
import com.capgemini.librarymanagement.entity.Issuebook;
import com.capgemini.librarymanagement.entity.Librarian;
import com.capgemini.librarymanagement.entity.Student;
import com.capgemini.librarymanagement.repository.IBookRepository;
import com.capgemini.librarymanagement.repository.ILibrarianRepository;
import com.capgemini.librarymanagement.service.IIssueBookService;
import com.capgemini.librarymanagement.service.ILibrarianService;


@Controller
public class LibrarianController {
	@Autowired
	 ILibrarianService librarianService;
	
	//add book form
		@RequestMapping("/addBookForm")
		public String addBookForm()
		{
			return "AddBookForm.jsp";
		}
		
		//issue book form
				@RequestMapping("/issueBookForm")
				public String issueBookForm()
				{
					return "IssueBookForm.jsp";
				}
				//return book form
				@RequestMapping("/returnBookForm")
				public String returnBookForm()
				{
					return "ReturnBookForm.jsp";
				}
				//delete book form
				@RequestMapping("/deleteBookForm")
				public String deleteBookForm()
				{
					return "DeleteBookForm.jsp";
				}
				
				//student id form
				@RequestMapping("/studentIdForm")
				public String studentIdForm()
				{
					return "StudentIdForm.jsp";
				}
				
			
		
	//librarian login
	@RequestMapping("/librarianLogin")
	@PostMapping
	public ModelAndView librarianLoginResponse(@RequestParam("lemail") String lemail,@RequestParam("lpassword") String lpassword)
	{
		ModelAndView modelAndView=new ModelAndView();

		//List<Admin> adminList=adminRepository.findByLogin(AName,APassword);
		if(librarianService.loginLibrarian(lemail,lpassword).equals("success"))
		{
			modelAndView.setViewName("LibrarianHome.jsp");
			//Admin admin=adminList.get(0);
			//modelAndView.addObject("AdminInfo", admin);
			modelAndView.addObject("librarianinfo",lemail);
		}
		else 
		{
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("statement","invalid email or password.. Please login again");
		
		}
		return modelAndView;
	}
	//add book
	@RequestMapping("/addBook")
	public ModelAndView addBook(Book book)
	{ 
		librarianService.addBook(book);
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookInfo", book);
		mv.setViewName("LibrarianHome.jsp");
		return mv;
		
	}
	//view book
	@RequestMapping("/viewBook")
	public ModelAndView viewBook()
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Book> booklist=librarianService.viewBook();
		modelAndView.addObject("bookinfo", booklist);
		modelAndView.setViewName("ViewBook.jsp");
		return modelAndView;
	}
	
	//issue book
	@RequestMapping("/issueBook")
	public ModelAndView issueBook(@RequestParam("book_id") int book_id,@RequestParam("stud_id") int stud_id,@RequestParam("issue_date") Date issue_date)
	{
		ModelAndView modelAndView=new ModelAndView();
		librarianService.issueBook(book_id, stud_id, issue_date);
		librarianService.editBook(book_id);
		modelAndView.setViewName("LibrarianHome.jsp");
		return modelAndView;
	}
	
	//return book
	@RequestMapping("/returnBook")
	public ModelAndView returnBook(@RequestParam("book_id") int book_id,@RequestParam("stud_id") int stud_id,@RequestParam("return_date") Date return_date)
	{
		ModelAndView modelAndView=new ModelAndView();
		librarianService.returnBook(book_id, stud_id, return_date);
		librarianService.editBooks(book_id);
		librarianService.editReturnStatus(book_id);
		modelAndView.setViewName("LibrarianHome.jsp");
		return modelAndView;
	}
	
	//view issued Books
	@RequestMapping("/viewIssuedBook")
	public ModelAndView viewIssuedBook()
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Issuebook> issueBookList=librarianService.viewIssueBook();
		modelAndView.addObject("issueInfo", issueBookList);
		modelAndView.setViewName("ViewIssuedBook.jsp");
		return modelAndView;
		
		
	}
	
	////delete book
	@RequestMapping("/deleteBook")
	public ModelAndView deleteBook(@RequestParam("book_id") int book_id)
	{
		ModelAndView mv=new ModelAndView();
		librarianService.deleteBook(book_id);
		mv.setViewName("LibrarianHome.jsp");
		return mv;
	}
	
	
	
	


}
