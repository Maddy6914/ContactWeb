package com.contactweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//POJO
@Entity
public class input {
	
  @Id
  private int id;
  private String name;
  private long  no;
  
  public String toString()
  {
	  return name +":"+ id;
  }
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNo() {
	return no;
}
public void setNo(long no) {
	this.no = no;
}

  
}
