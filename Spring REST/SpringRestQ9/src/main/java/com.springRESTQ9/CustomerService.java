package com.springRESTQ9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomers(){

		List<Customer> customers = new ArrayList<>();
		customerRepo.findAll()
		.forEach(customers::add);
		return customers;
	}
	
	public Optional<Customer> getCustomer(int id) {
		return customerRepo.findById(id);
	
	}
	
	public void addCustomer(Customer customer) {

		customerRepo.save(customer);
		
	}
	
	public void updateCustomer(int id, Customer customer) {

		customerRepo.save(customer); 
		
	}

	public void deleteCustomer(int id) {
		customerRepo.deleteById(id);
	}
	
}
