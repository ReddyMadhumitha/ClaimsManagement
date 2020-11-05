/**
 * 
 */
package com.hcl.claimsmanagementsystem.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author reddy-madhumitha
 *
 */
@Entity
@Table(name="credential")
public class Credential {
	@Id
	@NotEmpty
	private String userId;
	@NotEmpty
	private String password;
	/**
	 * @param userId
	 * @param password
	 */
	public Credential(@NotEmpty String userId, @NotEmpty String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	/**
	 * 
	 */
	public Credential() {
		super();
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	
	
}