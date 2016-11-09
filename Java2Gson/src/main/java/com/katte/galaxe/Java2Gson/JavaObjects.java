package com.katte.galaxe.Java2Gson;

import java.util.Date;

public class JavaObjects {
  private String fname;
  private String lname;
  private int age;
  private Date dob;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "JavaObjects [fname=" + fname + ", lname=" + lname + ", age=" + age + ", dob=" + dob + "]";
}
}
