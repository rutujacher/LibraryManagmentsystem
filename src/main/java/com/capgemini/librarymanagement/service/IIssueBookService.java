package com.capgemini.librarymanagement.service;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagement.repository.IIssueBookRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IIssueBookService {
	@Autowired
	IIssueBookRepository issueBookRepository;
	
	
	

}
