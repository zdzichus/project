package addressbook;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

import com.mongodb.MongoException;

public class AddressBookMongo implements AddressBook {
     String host = "192.168.0.29";
     int port = 27017;
     String dbName = "addressbook";
     String dbUser = "zdzichudb";
     String dbPassword = "kwiatek33";
 	
	public void addEntry(String firstName, String phone, String country, String city, String surname) {
		DBCollection addressCollection = getAddressCollection();
		
		addressCollection.insert(new BasicDBObject(firstName, phone));
	}

	
	
	public int size() {
		DBCollection addressCollection = getAddressCollection();
		return (int) addressCollection.getCount();
	}

	private DBCollection getAddressCollection() {
		try {
			Mongo mongo = new Mongo(host , port);
			 DB db = mongo.getDB(dbName);
			 db.authenticate(dbUser,dbPassword.toCharArray());
			DBCollection address = db.getCollection("addresses");
			return address;
		} catch (UnknownHostException e) {
			throw new RuntimeException(e);
		} catch (MongoException e) {
			throw new RuntimeException(e);
		
	}
	}
}
	

