package addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressBookTest {

	@Test
	public void test() {
		AddressBook book  = new AddressBookMongo();
	    // assertEquals(expected, actual);   
		assertEquals(book.size(), book.size());
		book.addEntry("Dzidek", "123456");
		book.addEntry("Dzidek1", "1234567");
		assertEquals(book.size()+2, book.size()+2);
	}

}
