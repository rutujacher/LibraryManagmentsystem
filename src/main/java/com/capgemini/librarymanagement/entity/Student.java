package com.capgemini.librarymanagement.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stud_id;
	private String stud_enrollment;
	private String stud_name;
	private String stud_email;
	private String stud_password;
	private String stud_contact;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_enrollment() {
		return stud_enrollment;
	}
	public void setStud_enrollment(String stud_enrollment) {
		this.stud_enrollment = stud_enrollment;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public String getStud_password() {
		return stud_password;
	}
	public void setStud_password(String stud_password) {
		this.stud_password = stud_password;
	}
	public String getStud_contact() {
		return stud_contact;
	}
	public void setStud_contact(String stud_contact) {
		this.stud_contact = stud_contact;
	}
	

}
