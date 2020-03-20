package addressbook;

public interface AddressBook {

	void addEntry(String surname, String[] myStringArray);
	void readEntry(String surname, String[] myStringArray);
	 
	int size();

}