package com.capgemini.collection.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public long getId() {
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +" ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		if (this == obj)
			return true;
		Student student = (Student) obj;
		if (this.id == student.id && this.name == student.name )
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return (Objects.hash(id));
	}
	
	@Override
	public int compareTo(Student student) {
		return (this.id - student.id);
	}

}