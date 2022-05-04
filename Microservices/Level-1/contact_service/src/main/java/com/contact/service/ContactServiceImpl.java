package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

	//fake list of contacts

	List<Contact> list = List.of(
			new Contact(1L, "tony@gmail.com", "Antony", 1311L),
			new Contact(2L, "ken@gmail.com", "Kenta", 1311L),
			new Contact(3L, "jules@gmail.com", "Julius", 1312L),
			new Contact(4L, "rue@gmail.com", "Rue", 1314L)
	);


	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
}