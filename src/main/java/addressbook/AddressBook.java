package addressbook;

public interface AddressBook {

	void addEntry(String firstName, String phone, String surname, String country, String city);
	
	int size();

}

