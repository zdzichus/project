
package addressbook;


import java.util.HashMap;
import java.util.Map;

public class AddressBookInMemory implements AddressBook {
	private Map<String, String> addressMap = new HashMap<String, String>();
	
	
	public void addEntry(String surname, String phone) {
          addressMap.put(surname, phone);  
		
	}

	public int size() {
		
		return addressMap.size();
	}

	public void addEntry(String surname, String[] myStringArray) {
		// TODO Auto-generated method stub
		
	}




}