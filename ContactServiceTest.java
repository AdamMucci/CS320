package io.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	public void testAddContact() {
		ContactService ct = new ContactService();
		ct.addContact("1234");
		assertThrows(IllegalArgumentException.class, () -> ct.addContact("1234"));
	}
	
	@Test
	public void testDeleteContact() {
		ContactService ct = new ContactService();
		ct.addContact("1234");
		ct.deleteContact("1234");
	}
	
	@Test
	public void testUpdateFields() {
		ContactService ct = new ContactService();
		ct.addContact("1234");
		
		ct.updateFirstName("1234", "John");
		assertTrue(ct.getFirstName("1234").equals("John"));
		
		ct.updateLastName("1234", "Doe");
		assertTrue(ct.getLastName("1234").equals("Doe"));
		
		ct.updatePhone("1234", "6038586013");
		assertTrue(ct.getPhone("1234").equals("6038586013"));
		
		ct.updateAddress("1234", "3 Sample Lane");
		assertTrue(ct.getAddress("1234").equals("3 Sample Lane"));
	}
		

}
