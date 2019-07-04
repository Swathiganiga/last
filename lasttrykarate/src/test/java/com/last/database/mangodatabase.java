package com.last.database;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class mangodatabase{
public static void main(String[] args)  throws UnknownHostException{ 
	create();
}
public static Object create()
{
	MongoClient mongo=null;
	try {
		mongo = new MongoClient("localhost", 27017);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	 DB database = mongo.getDB("last");
		database.createCollection("try1", null);
	DBCollection table = database.getCollection("try1");
	BasicDBObject document = new BasicDBObject();
	
	document.put("name", "avani");
	document.put("lastName", "bs");
	document.put("age", 41);
	return document;
	
}
}