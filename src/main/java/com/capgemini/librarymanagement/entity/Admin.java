package com.capgemini.librarymanagement.entity;
import javax.persistence.*;
@Entity
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AId;
	private String AName;
	private String APassword;
	public int getaId() {
		return AId;
	}
	public void setaId(int aId) {
		this.AId = aId;
	}
	public String getaName() {
		return AName;
	}
	public void setaName(String aName) {
		this.AName = aName;
	}
	public String getaPassword() {
		return APassword;
	}
	public void setaPassword(String aPassword) {
		this.APassword = aPassword;
	}
	
	
}
