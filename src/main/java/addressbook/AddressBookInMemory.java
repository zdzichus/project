package addressbook;


import java.util.HashMap;
import java.util.Map;

public class AddressBookInMemory implements AddressBook {
	private Map<String, String> addressMap = new HashMap<String, String>();
	
	
	public void addEntry(String firstName, String phone) {
          addressMap.put(firstName, phone);  
		
	}
	public void addEntry1(String city, String country) {
        addressMap.put(city, country);  
		
	}


	public int size() {
		
		return addressMap.size();
	}

	public void addEntry(String firstName, String phone, String surname, String country, String city) {
		// TODO Auto-generated method stub
		
	}
	public void addEntry1(String firstName, String phone, String surname, String country, String city) {
		// TODO Auto-generated method stub
		
	}

}
