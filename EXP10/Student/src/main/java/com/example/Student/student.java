package com.example.Student;

public class student {
	int sno;
	String sname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "student [sno=" + sno + ", sname=" + sname + "]";
	}
	public student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
