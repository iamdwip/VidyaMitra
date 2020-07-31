package courseDesign;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
Connection ConnectDB() {
	Connection c = null;
    
    try {
       Class.forName("com.ibm.db2.jcc.DB2Driver");
       c = DriverManager
          .getConnection("jdbc:db2://dashdb-txn-sbox-yp-lon02-06.services.eu-gb.bluemix.net:50000/BLUDB:retrieveMessagesFromServerOnGetMessage=true;",
          "ngw74285", "cn-llfbcgwznfq85");
       
    }catch (Exception e) {
    	System.out.println(e);
    }
	return c;
}
}
