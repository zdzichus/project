package addressbook;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class LoginBookMongo {
	

	String host = "192.168.0.29";
	int port = 27017;
	String dbName = "addressbook";
	String dbUser = "zdzichudb";
	String dbPassword = "kwiatek33";
	DBCollection addressCollection = getAddressCollection();

	
	public DBCollection getAddressCollection() {
		try {
			Mongo mongo = new Mongo(host, port);
			DB db = mongo.getDB(dbName);
			db.authenticate(dbUser, dbPassword.toCharArray());
			DBCollection address = db.getCollection("login");
			return address;
		} catch (UnknownHostException e) {
			throw new RuntimeException(e);
		} catch (MongoException e) {
			throw new RuntimeException(e);

		}
	}
	
	
	
	
	

}
