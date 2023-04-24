package io.services;

import java.util.ArrayList;

public class ContactService {
	public ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public void addContact(String contactID) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				throw new IllegalArgumentException("Non-unique contact ID");
			}
		}
		contacts.add(new Contact(contactID));
	}
	
	public void deleteContact(String contactID) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				contacts.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("Contact ID not in list");
	}
	
	public void updateFirstName(String contactID, String firstName) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				contacts.get(i).setFirstName(firstName);
			}
		}
	}
	
	public void updateLastName(String contactID, String lastName) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				contacts.get(i).setLastName(lastName);
			}
		}
	}
	
	public void updatePhone(String contactID, String phone) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				contacts.get(i).setPhone(phone);
			}
		}
	}
	
	public void updateAddress(String contactID, String address) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				contacts.get(i).setAddress(address);
			}
		}
	}
	
	public String getFirstName(String contactID) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				return contacts.get(i).getFirstName();
			}
		}
		return null;
	}
	
	public String getLastName(String contactID) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				return contacts.get(i).getLastName();
			}
		}
		return null;
	}
	
	public String getPhone(String contactID) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				return contacts.get(i).getPhone();
			}
		}
		return null;
	}
	
	public String getAddress(String contactID) {
		for (int i = 0; i < contacts.size(); ++i) {
			if (contactID.equals(contacts.get(i).getContactID())) {
				return contacts.get(i).getAddress();
			}
		}
		return null;
	}
}
