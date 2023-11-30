  package com.BikkadIT.CrudRepositoryMethods.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Student_Details")
public class Student {

	@Id
	@Column(name = "Student_id")
	private int sid;
	@Column(name = "Student_name")
	private String sname;
	@Column(name = "Student_address")
	private String saddress;
	@Column(name = "Student_rank")
	private int srank;
	@Column(name = "Student_email")
	private String semail;
	@Column(name = "Student_password")
	private String spassword;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSrank() {
		return srank;
	}
	public void setSrank(int srank) {
		this.srank = srank;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", srank=" + srank + ", semail="
				+ semail + ", spassword=" + spassword + "]";
	}
	
	
}
