/**
 * 
 */
package com.hcl.claimsmanagementsystem.model;

/**
 * @author reddy-madhumitha
 *
 */
public class Payment {
	private int id;
	private String requestAmount;
	private String claimAmount;
	private String claimId;
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
