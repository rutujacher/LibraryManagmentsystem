package com.capgemini.librarymanagement.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Librarian {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lid;
	private String lname;
	private String lemail;
	private String lpassword;
	private String lcontact;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLemail() {
		return lemail;
	}
	public void setLemail(String lemail) {
		this.lemail = lemail;
	}
	public String getLpassword() {
		return lpassword;
	}
	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}
	public String getLcontact() {
		return lcontact;
	}
	public void setLcontact(String lcontact) {
		this.lcontact = lcontact;
	}
	

}
