Feature: greeting end point




Scenario: check database value


  
* def MongoDBExample = Java.type('com.last.database.mangodatabase')
* def result = MongoDBExample.create()
* print 'created id is: ' + result

* match result == {  name : "avani" , lastName : "bs" , age : 41 }


