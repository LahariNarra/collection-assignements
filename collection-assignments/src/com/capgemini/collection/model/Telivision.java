package com.capgemini.collection.model;

import java.util.Objects;

public class Telivision {
	private String company;
	private String type;
	private String threeDEnabled;
	private double price;

	public Telivision() {
		super();
	}

	public Telivision(String company, String type, String threeDEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getThreeDEnabled() {
		return threeDEnabled;
	}

	public void setThreeDEnabled(String threeDEnabled) {
		this.threeDEnabled = threeDEnabled;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Telivision [company=" + company + ", type=" + type + ", threeDEnabled=" + threeDEnabled + ", price="
				+ price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Telivision))
			return false;
		if (this == obj)
			return true;
		Telivision telivision = (Telivision) obj;
		if (this.company == telivision.company && this.type == telivision.type
				&& this.threeDEnabled == telivision.threeDEnabled && this.price == telivision.price)
			return true;
		return false;

	}
	
	@Override
	public int hashCode() {
		return (Objects.hash(company));
	}

}
