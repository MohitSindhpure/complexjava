package com.BikkadIT.model;

public class InsurancePolicy {

	private String policyname;
	
	private String startDate;
	
	private String endDate;
	
	private Double premiumAmt;

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Double getPremiumAmt() {
		return premiumAmt;
	}

	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [policyname=" + policyname + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", premiumAmt=" + premiumAmt + "]";
	}
	
	
}
