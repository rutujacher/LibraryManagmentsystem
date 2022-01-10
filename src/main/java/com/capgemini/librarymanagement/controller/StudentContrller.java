package com.capgemini.librarymanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.librarymanagement.entity.Book;
import com.capgemini.librarymanagement.entity.Issuebook;
import com.capgemini.librarymanagement.entity.Student;
import com.capgemini.librarymanagement.repository.IStudentRepository;
import com.capgemini.librarymanagement.service.ILibrarianService;
import com.capgemini.librarymanagement.service.IstudentService;



@Controller
public class StudentContrller {
	@Autowired
	IstudentService studentService;
	//Student home page
	@RequestMapping("/studentHome")
	public String studentHome()
	{
		return "StudentHome.jsp";
	}
	//student login
	@RequestMapping("/studentLogin")
	@PostMapping
	public ModelAndView showLoginResponse(@RequestParam("stud_email") String stud_email,@RequestParam("stud_password") String stud_password)
	{
		ModelAndView modelAndView=new ModelAndView();
		if(studentService.loginStudent(stud_email,stud_password).equals("success"))
		{
	
			modelAndView.addObject("stud_email",stud_email);
			modelAndView.setViewName("StudentHome.jsp");
			
		}
		else 
		{
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("statement","invalid email or password.. Please login again!!");
		
		}
		return modelAndView;

	}
	
	//view book
		@RequestMapping("/viewBooks")
		public ModelAndView viewBooks()
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Book> booklist=studentService.viewBooks();
			modelAndView.addObject("bookinfo", booklist);
			modelAndView.setViewName("ViewBookStudent.jsp");
			return modelAndView;
		}
		
		
		//view issued books
		@RequestMapping("/viewIssueBook")
		public ModelAndView viewIssueBook(@RequestParam("stud_id") int stud_id)
		{
			ModelAndView modelAndView=new ModelAndView();
			//List<Student> studlist=studentService.viewStudent(stud_email);
			//Student s=studlist.get(0);
			//int stud_id=s.getStud_id();
			List<Issuebook> issuebooklist=studentService.viewIssueBook(stud_id);
			modelAndView.addObject("IssueBook", issuebooklist);
			modelAndView.setViewName("StudentIssuedBook.jsp");
			return modelAndView;
			
		}
		//view issued books
		@RequestMapping("/studentIssue")
		public ModelAndView viewIssue(@RequestParam("stud_email") String stud_email)
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Student> studlist=studentService.viewStudent(stud_email);
			Student s=studlist.get(0);
			int stud_id=s.getStud_id();
			System.out.println(stud_id);
			List<Issuebook> issuebooklist=studentService.viewIssueBook(stud_id);
			modelAndView.addObject("IssueBook", issuebooklist);
			modelAndView.setViewName("StudentIssuedBook.jsp");
			return modelAndView;
			
		}
		
		//view student profile
		@RequestMapping("/studentProfile")
		public ModelAndView studentProfile(@RequestParam("stud_email") String stud_email)
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Student> studlist=studentService.viewStudent(stud_email);
			Student student=studlist.get(0);
			modelAndView.addObject("studProfile", student);
			modelAndView.setViewName("StudentProfile.jsp");
			return modelAndView;
			
		}
		
	

}