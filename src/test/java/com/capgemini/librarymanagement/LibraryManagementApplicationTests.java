package com.capgemini.librarymanagement;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.librarymanagement.service.IAdminService;
import com.capgemini.librarymanagement.service.ILibrarianService;
import com.capgemini.librarymanagement.service.IstudentService;


@SpringBootTest
class LibraryManagementApplicationTests {

	@Test
	void contextLoads() {
	}
	//Admin login test case
	@Autowired
	IAdminService adminService;
	@Test
	public void testAdminLogin()
	{
		//IAdminService adminService=new IAdminService();
		String result=adminService.loginAdmin("admin", "admin123");
		assertEquals("success",result);
	}
	//librarian login test case
	@Autowired
	ILibrarianService librarianService;
	@Test
	public void testLibrarianLogin()
	{
		//IAdminService adminService=new IAdminService();
		String result=librarianService.loginLibrarian("ankita@gmail.com", "ankita");
		assertEquals("success",result);
	}
	
	//student login test case
		@Autowired
		IstudentService studentService;
		@Test
		public void testStudentLogin()
		{
			//IAdminService adminService=new IAdminService();
			String result=studentService.loginStudent("shifa@gmail.com", "shifa");
			assertEquals("success",result);
		}
		

}
