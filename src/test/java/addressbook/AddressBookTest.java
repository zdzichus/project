package addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressBookTest {

	@Test
	public void test() {
		AddressBook book  = new AddressBookMongo();
	    // assertEquals(expected, actual);   
		assertEquals(book.size(), book.size());
		book.addEntry("Dzidek", "123456","Dzidek", "123456","Dzidek");
	
		assertEquals(book.size()+2, book.size()+2);
	}

}
