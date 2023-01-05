package com.BikkadIT.javaToJson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.BikkadIT.model.Customer;
import com.BikkadIT.model.InsurancePolicy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonProcessingException, JAXBException {

		InsurancePolicy insurancePolicy = new InsurancePolicy();

		insurancePolicy.setPolicyname("LIC");
		insurancePolicy.setStartDate("12-Dec-2022");
		insurancePolicy.setEndDate("30-Dec-2022");
		insurancePolicy.setPremiumAmt(5000.00);

		System.out.println(insurancePolicy);
		
		Customer customer = new Customer();
		
		customer.setCustomerId(1);
		customer.setCustomerName("Mohit Sindhpure");
		customer.setCustomerAge(24);
		customer.setCustomerEmailString("mohitsindhpure1998@gmail.com");
		customer.setInsurancePolicy(insurancePolicy);
		System.out.println(customer);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(customer);
		
		System.out.println(writeValueAsString);
		
		
		JAXBContext newInstance = JAXBContext.newInstance(Customer.class);
		Marshaller createMarshaller = newInstance.createMarshaller();
		createMarshaller.marshal(customer, System.out);
		
	}
}
