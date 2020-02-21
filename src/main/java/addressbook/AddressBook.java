package addressbook;


import java.util.HashMap;
import java.util.Map;

public class AddressBook {
	private Map<String, String> addressMap = new HashMap<String, String>();
	
	
	public void addEntry(String firstName, String phone) {
          addressMap.put(firstName, phone);  
		
	}

	public int size() {
		
		return addressMap.size();
	}

}
