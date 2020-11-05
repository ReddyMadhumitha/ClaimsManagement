package com.hcl.claimsmanagementsystem.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;





@Entity
@Table(name="admin")
public class Admin {
	@Id
	private int id;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@Range(min=18,max=50)
	private String age;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String contactNumber;
	@NotEmpty
	private String adminId;
	@NotEmpty
	private String password;
	@NotEmpty
	private String confirmPassword;
	@NotEmpty
	private String aadharNumber;
	/**
	 * 
	 */
	public Admin() {
		super();
	}
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gender
	 * @param contactNumber
	 * @param adminId
	 * @param password
	 * @param confirmPassword
	 * @param aadharNumber
	 */
	public Admin(int id, String firstName, String lastName, String age, String gender, String contactNumber,
			String adminId, String password, String confirmPassword, String aadharNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.adminId = adminId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.aadharNumber = aadharNumber;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the adminId
	 */
	public String getAdminId() {
		return adminId;
	}
	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the aadharNumber
	 */
	public String getAadharNumber() {
		return aadharNumber;
	}
	/**
	 * @param aadharNumber the aadharNumber to set
	 */
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

}
