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
@Table(name="payment")
public class Payment {
	@Id
	@NotEmpty
	private int id;
	@NotEmpty
	private String requestAmount;
	@NotEmpty
	private String claimAmount;
	@NotEmpty
	private String claimId;
	@NotEmpty
	private String memberId;
	/**
	 * @param id
	 * @param requestAmount
	 * @param claimAmount
	 * @param claimId
	 * @param memberId
	 */
	public Payment(int id, String requestAmount, String claimAmount, String claimId, String memberId) {
		super();
		this.id = id;
		this.requestAmount = requestAmount;
		this.claimAmount = claimAmount;
		this.claimId = claimId;
		this.memberId = memberId;
	}
	/**
	 * 
	 */
	public Payment() {
		super();
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
	 * @return the requestAmount
	 */
	public String getRequestAmount() {
		return requestAmount;
	}
	/**
	 * @param requestAmount the requestAmount to set
	 */
	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}
	/**
	 * @return the claimAmount
	 */
	public String getClaimAmount() {
		return claimAmount;
	}
	/**
	 * @param claimAmount the claimAmount to set
	 */
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}
	/**
	 * @return the claimId
	 */
	public String getClaimId() {
		return claimId;
	}
	/**
	 * @param claimId the claimId to set
	 */
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	

}
