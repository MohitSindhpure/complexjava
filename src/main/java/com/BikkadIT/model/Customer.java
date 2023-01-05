package com.BikkadIT.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private int customerId;
	private String customerName;
	private String customerEmailString;
	private int customerAge;
	
	private InsurancePolicy insurancePolicy;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailString() {
		return customerEmailString;
	}

	public void setCustomerEmailString(String customerEmailString) {
		this.customerEmailString = customerEmailString;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public InsurancePolicy getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmailString="
				+ customerEmailString + ", customerAge=" + customerAge + ", insurancePolicy=" + insurancePolicy + "]";
	}
	
}
