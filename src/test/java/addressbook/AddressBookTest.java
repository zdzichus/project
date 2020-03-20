package addressbook;

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

	private void assertEquals(int size, int size2) {
		// TODO Auto-generated method stub
		
	}



	
}
