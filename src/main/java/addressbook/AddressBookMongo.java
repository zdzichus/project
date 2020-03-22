package addressbook;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class AddressBookMongo implements AddressBook {

	String host = "192.168.0.29";
	int port = 27017;
	String dbName = "addressbook";
	String dbUser = "zdzichudb";
	String dbPassword = "kwiatek33";

	public AddressBookMongo() {
		// TODO Auto-generated constructor stub
	}

	public void addEntry(String table_name, String[] myStringArray) {
		DBCollection addressCollection = getAddressCollection();
		addressCollection.insert(new BasicDBObject(table_name, myStringArray));

	}

	public String readAllEntry() {
		
		StringBuilder items = new StringBuilder();
		DBCollection addressCollection = getAddressCollection();
		DBCursor cursor = addressCollection.find();
		try {
			while (cursor.hasNext()) {
				items.append(cursor.next().toString());
				
				
			}
		} finally {

			cursor.close();
		}
		return items.toString();

	}
	

	public DBObject readEntry() {
		DBCollection addressCollection = getAddressCollection();
		return (DBObject) addressCollection.findOne();

	}

	public int size() {
		DBCollection addressCollection = getAddressCollection();
		return (int) addressCollection.getCount();
	}

	public DBCollection getAddressCollection() {
		try {
			Mongo mongo = new Mongo(host, port);
			DB db = mongo.getDB(dbName);
			db.authenticate(dbUser, dbPassword.toCharArray());
			DBCollection address = db.getCollection("addresses");
			return address;
		} catch (UnknownHostException e) {
			throw new RuntimeException(e);
		} catch (MongoException e) {
			throw new RuntimeException(e);

		}
	}

	public void addEntry(String person_table, String string) {
		// TODO Auto-generated method stub

	}

}
