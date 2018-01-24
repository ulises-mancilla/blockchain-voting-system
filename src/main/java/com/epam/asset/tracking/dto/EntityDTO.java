package com.epam.asset.tracking.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class EntityDTO {

	//Name --> Text, not allowed numbers or symbols
	@NotEmpty
	@Length(max = 140)
	String name;
	
	//Last name --> Text, not allowed numbers or symbols
	@NotEmpty
	@Length(max = 140)
	String lastName;
	
	//User Name--> Text, not allowed numbers or symbols --> validation (user name unique)
	@NotEmpty
	@Length(max = 140)
	String userName;
	
	//Password --> text, numbers, symbols
	@NotEmpty
	@Length(max = 10)
	String password;
	
	
	//Type of business --> List (Computer sellers, computer repairers, house sellers, house brokers, car sellers, mechanics)
	@NotEmpty
	@Length(max = 50)
	String businessType;

	//Address --> text and numbers
	@NotEmpty
	@Length(max = 256)
	String address;
	
	//City --> text, not allowed numbers or symbols
	@NotEmpty
	@Length(max = 140)
	String city;
	
	//ZipCode --> just numbers validated just 5
	@NotEmpty
	@Length(min = 5, max = 5)
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	@Max(99999)
	String zipCode;
	
	//RFC --> Text and numbers not symbols
	@NotEmpty
	@Length(max = 13)
	String rfc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	

}