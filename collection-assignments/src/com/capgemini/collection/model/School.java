package com.capgemini.collection.model;

import java.util.Objects;

public class School implements Comparable<School> {

	private String name;
	private String city;
	private String schooldistrict;
	private int greatSchoolRanking;

	public School() {
		super();

	}

	public School(String name, String city, String schooldistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schooldistrict = schooldistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchooldistrict() {
		return schooldistrict;
	}

	public void setSchooldistrict(String schooldistrict) {
		this.schooldistrict = schooldistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", schooldistrict=" + schooldistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;
		if (this == obj)
			return true;
		School school = (School) obj;
		if (this.name == school.name && this.city == school.city && this.schooldistrict == school.schooldistrict
				&& this.greatSchoolRanking == school.greatSchoolRanking)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return (Objects.hash(name));
	}
	
	@Override
	public int compareTo(School school) {
		return (this.name.compareTo(school.name));
	}

}
