package io.services;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	/* Note: the rubric was inconsistent on if the field should be named phone or number.
	 * In the Contact requirements section, it says phone.
	 * In the Contact Service requirements section, it says number.
	 */
	private String phone;
	private String address;
	
	Contact(String contactID) {
		if (contactID == null) {
			throw new IllegalArgumentException("Null contact ID");
		}
		else if (contactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID too long");
		}
		else {
			this.contactID = contactID;
		}
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public void setFirstName(String firstName) {
		// Short-circuit evaluation prevents calling length() on a null string.
		if (firstName == null) {
			throw new IllegalArgumentException("Null first name");
		}
		else if (firstName.length() > 10) {
			throw new IllegalArgumentException("First name too long");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Null last name");
		}
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Last name too long");
		}
		else {
			this.lastName = lastName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhone(String phone) {
		if (phone == null) {
			throw new IllegalArgumentException("Null phone");
		}
		else if (phone.length() != 10) {
			throw new IllegalArgumentException("Invalid number of digits");
		}
		/*
		 * Utilizes regular expressions to make sure the phone is only digits.
		 * Source: https://stackoverflow.com/questions/10575624/java-string-see-if-a-string-contains-only-numbers-and-not-letters
		 * Note: the rubric was unclear on if the phone number should be hyphenated.
		 * This version does not accept hyphenated input.
		 */
		else if (!phone.matches("[0-9]+")) {
			throw new IllegalArgumentException("Not only digits");
		}
		else {
			this.phone = phone;
		}
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Null address");
		}
		else if (address.length() > 30) {
			throw new IllegalArgumentException("Address too long");
		}
		else {
			this.address = address;
		}
	}
	
	public String getAddress() {
		return address;
	}
}
