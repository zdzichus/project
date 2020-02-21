package addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressBookTest {

	@Test
	public void test() {
		AddressBook book  = new AddressBook();
		assertEquals(0, book.size());
		book.addEntry("Dzidek", "123456");
		assertEquals(1, book.size());
	}

}
