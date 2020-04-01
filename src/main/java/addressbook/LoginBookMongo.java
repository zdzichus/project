package addressbook;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
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
			DBCollection add = db.getCollection("login");
			return add;
		} catch (UnknownHostException e) {
			throw new RuntimeException(e);
		} catch (MongoException e) {
			throw new RuntimeException(e);

		}
	}
	
	public void addRows(String first, String second) {
		addressCollection.insert(new BasicDBObject());
        
	}

	public String readAllComp() {

		StringBuilder items = new StringBuilder();
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
	
	

}
