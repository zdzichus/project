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
		book.addEntry1("Dzidek1", "1234561","Dzidek1", "1234561","Dzidek1");
		assertEquals(book.size()+2, book.size()+2);
	}

}
