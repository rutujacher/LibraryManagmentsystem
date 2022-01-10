package com.capgemini.librarymanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.capgemini.librarymanagement.entity.Admin;
import com.capgemini.librarymanagement.entity.Librarian;
import com.capgemini.librarymanagement.entity.Student;
import com.capgemini.librarymanagement.repository.IAdminRepository;
import com.capgemini.librarymanagement.repository.ILibrarianRepository;
import com.capgemini.librarymanagement.repository.IStudentRepository;
import com.capgemini.librarymanagement.service.IAdminService;


@Controller
public class AdminController {
	@Autowired
	IAdminService adminService;
	//home page
	@RequestMapping("/")
	public String homePage()
	{
		return "index.jsp";
	}
	
	//
	//add librarian form
	@RequestMapping("/addLibrarianForm")
	public String librarianForm()
	{
		return "AddLibrarianForm.jsp";
	}
	
	//edit librarian form
	@RequestMapping("/editLibrarianForm")
	public String editLibrarianForm()
	{
		return "EditLibrarianForm.jsp";
	}
	//delete librarian form
	@RequestMapping("/deleteLibrarianForm")
	public String deleteLibrarianForm()
	{
		return "DeleteLib.jsp";
	}
	
	
	//add student form
	@RequestMapping("/addStudentForm")
	public String addStudentForm()
	{
		return "AddStudentForm.jsp";
	}
	
	//edit student form
		@RequestMapping("/editStudentForm")
		public String editStudentForm()
		{
			return "EditStudent.jsp";
		}
		
		//delete student form
		@RequestMapping("/deleteStudentForm")
		public String deleteStudentForm()
		{
			return "DeleteStudent.jsp";
		}
		
	
	
	@RequestMapping("/adminLogin")
	@PostMapping
	public ModelAndView adminLoginResponse(@RequestParam("aName") String AName,@RequestParam("aPassword") String APassword)
	{
		ModelAndView modelAndView=new ModelAndView();

		//List<Admin> adminList=adminRepository.findByLogin(AName,APassword);
		if(adminService.loginAdmin(AName,APassword).equals("success"))
		{
			modelAndView.setViewName("AdminHome.jsp");
			//Admin admin=adminList.get(0);
			//modelAndView.addObject("AdminInfo", admin);
			modelAndView.addObject("admininfo",AName);
		}
		else 
		{
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("statement","invalid Username or password.. Please login again!!");
		
		}
		return modelAndView;
	}
	
	//add librarian
	@RequestMapping("/addLibrarian")
	@PostMapping
	public ModelAndView showModelResponse(Librarian librarian)
	{
		//librarianrepository.save(librarian1);
		ModelAndView mv=new ModelAndView();
		//mv.addObject("LibrarianInfo",librarian1);
		adminService.addLibrarian(librarian);
		mv.setViewName("AdminHome.jsp");
		return mv;
	}
	
	//add student
	@RequestMapping("/addStudent")
	@PostMapping
	public ModelAndView addStudent(Student student)
	{
		ModelAndView mv=new ModelAndView();
		adminService.addStudent(student);
		//mv.addObject("studentInfo",student);
		
		mv.setViewName("AdminHome.jsp");
		return mv;
	}
	
	/*@RequestMapping("/viewLibrarian")
	public ModelAndView viewLibrarian()
	{
		ModelAndView mv=new ModelAndView();
		List<Librarian> li=(List<Librarian>) librarianrepository.findAll();
		mv.addObject("librarianinfo", li);
		mv.setViewName("ViewLibrarian.jsp");
		return mv;
	}*/
	//view librarian
	@RequestMapping("/viewLibrarian")
	public ModelAndView viewLibrarian()
	{
		ModelAndView mv=new ModelAndView();
		List<Librarian> librarianlist=adminService.viewLibrarian();
		mv.addObject("librarianinfo", librarianlist);
		mv.setViewName("ViewLibrarian.jsp");
		return mv;
	}
	
	//edit librarian
	@RequestMapping("/editLibrarian")
	@PostMapping
	public ModelAndView editLibrarian(@RequestParam("lid") int lid,@RequestParam("lname") String lname,@RequestParam("lemail") String lemail,@RequestParam("lpassword") String lpassword,@RequestParam("lcontact") String lcontact)
	{
		ModelAndView mv=new ModelAndView();
		adminService.editLibrarian(lid,lname,lemail,lpassword,lcontact);
		mv.setViewName("AdminHome.jsp");
		return mv;
	}
	
	//delete librarian
	@RequestMapping("/deleteLibrarians")
	public ModelAndView deleteLibrarian(@RequestParam("lid") int lid)
	{
		ModelAndView mv=new ModelAndView();
		adminService.deleteLibrarian(lid);
		mv.setViewName("AdminHome.jsp");
		return mv;
	}
	//delete librarian
	@RequestMapping("/deleteLibrarian/{lid}")
	public RedirectView delete(@PathVariable("lid") int lid)
	{
		adminService.deleteLibrarian(lid);
		return new RedirectView("AdminHome.jsp");
	}
	
	
	//view student
	@RequestMapping("/viewStudent")
	public ModelAndView viewStudent()
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Student> studentlist=adminService.viewStudent();
		modelAndView.addObject("studentinfo", studentlist);
		modelAndView.setViewName("ViewStudent.jsp");
		return modelAndView;
	}
	
	//edit student
		@RequestMapping("/editStudent")
		@PostMapping
		public ModelAndView editStudent(@RequestParam("stud_id") int stud_id,@RequestParam("stud_enrollment") String stud_enrollment,@RequestParam("stud_name") String stud_name,@RequestParam("stud_email") String stud_email,@RequestParam("stud_password") String stud_password,@RequestParam("stud_contact") String stud_contact)
		{
			ModelAndView mv=new ModelAndView();
			adminService.editStudent(stud_id, stud_enrollment, stud_name, stud_email, stud_password, stud_contact);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
		
		//delete student
		@RequestMapping("/deleteStudent")
		public ModelAndView deleteStudent(@RequestParam("stud_id") int stud_id)
		{
			ModelAndView mv=new ModelAndView();
			adminService.deleteStudent(stud_id);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
		
		
	
	



}
