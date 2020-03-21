package addressbook;

import com.mongodb.DBObject;

public interface AddressBook {

	void addEntry(String surname, String[] myStringArray);
     
	 
	int size();
	DBObject readEntry();

}