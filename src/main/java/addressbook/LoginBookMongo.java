package addressbook;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.sun.tools.javac.util.List;

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
	
		
	public void addRows(String processor, String ram, String comp) {
		 
		 long id = addressCollection.getCount();
		 addressCollection.insert(new BasicDBObject().append("Id",id).append("processor", processor).append("Comp", comp).append("RAM", ram));
       
	
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
