package com.cs.repository;

import com.cs.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Custrepo extends CrudRepository<Customer, String> {

}
