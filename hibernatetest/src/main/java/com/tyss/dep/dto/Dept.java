package com.tyss.dep.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_info")
public class Dept implements Serializable
{
		@Id
		@Column(name="dept_id")
		private int dept_id;
		@Column(name="dept_name")
		private String dept_name; 
		@Column(name="location")
		private String location;    

	   public Dept() {}
	   
	   public Dept(int  dept_id, String dept_name, String  location) {
	      this. dept_id= dept_id;
	      this.dept_name = dept_name;
	      this.location = location;
	   }
	   
	   public int getDeptno() {
	      return dept_id;
	   }
	   
	   public void setDeptno( int dept_id ) {
	      this.dept_id = dept_id;
	   }
	   
	   public String getdname() {
	      return dept_name;
	   }
	   
	   public void setDname( String dept_name ) {
	      this.dept_name = dept_name;
	   }
	   
	   public String getLocation() {
	      return location;
	   }
	   
	   public void setLocation( String location ) {
	      this.location = location;
	   }

}
