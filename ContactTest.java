package io.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	public void testContactID() {
		// The updateability of the contact ID can't be tested, as there's no way to access it even from a subclass.
		assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901"));
		assertThrows(IllegalArgumentException.class, () -> new Contact(null));
	}
	
	@Test
	public void testFirstName() {
		Contact contact = new Contact("1234");
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("12345678901"));
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
	}
	
	@Test
	public void testLastName() {
		Contact contact = new Contact("1234");
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName("12345678901"));
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
	}
	
	@Test
	public void testPhone() {
		Contact contact = new Contact("1234");
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone("12345678901"));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123456"));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123456789a"));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
	}
	
	@Test
	public void testAddress() {
		Contact contact = new Contact("1234");
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress("dichlorodiphenyltrichloroethane"));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
	}
}