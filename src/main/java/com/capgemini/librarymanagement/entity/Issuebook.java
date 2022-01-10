package com.capgemini.librarymanagement.entity;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Issuebook {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int issueid;
	private int book_id;
	private int stud_id;
	private Date issue_date;
	private String return_status;
	public int getIssueid() {
		return issueid;
	}
	public void setIssueid(int issueid) {
		this.issueid = issueid;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_status() {
		return return_status;
	}
	public void setReturn_status(String return_status) {
		this.return_status = return_status;
	}
	
	
	
	
	

}
