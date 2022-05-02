package com.cs.transactions;

import java.util.Optional;

import com.cs.model.Customer;
import com.cs.repository.Custrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Trans {

	@Autowired
	private Custrepo custrepo;

	public Customer saveCustomer(Customer c) {
		return custrepo.save(c);
	}

	public <S extends Customer> S save(S s) {
		return custrepo.save(s);
	}

	public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	public Optional<Customer> findById(String s) {
		return Optional.empty();
	}

	public boolean existsById(String s) {
		return false;
	}

	public Iterable<Customer> findAll() {
		return null;
	}

	public Iterable<Customer> findAllById(Iterable<String> strings) {
		return null;
	}

	public long count() {
		return 0;
	}
}
