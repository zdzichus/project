package addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressBookTest {

	@Test
	public void TestToCheckSize() {
		AddressBookMongo book  = new AddressBookMongo();
	    // assertEquals(expected, actual);  
		assertEquals(book.size(), book.size());
		book.addEntry("Dzidek", "123456");
		assertEquals(book.size()+2, book.size()+2);
	}



	
}
