package courseDesign;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLStatement {

	void AddCourse(String s, String t, String d) {
		Connection c = null;
	    //Statement stmt = null;
	      try {
	    	 DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 //stmt = c.createStatement();
	    	 PreparedStatement stmt=c.prepareStatement("INSERT INTO COURSES (SUBJECT,TOPIC,COURSECONTENT,HASQUIZ) VALUES (?,?,?,?)");
	    	 stmt.setString(1,s);  
	    	 stmt.setString(2,t); 
	    	 stmt.setString(3,d); 
	    	 stmt.setString(4,"N");
	    	 
	    	 stmt.executeUpdate();  
	         c.close();
	      }catch (Exception e) {
	    	  
	      }
	}
	
	List<Courses> FetchCourse() {
		Connection c = null;
	    Statement stmt = null;
	    List <Courses> courseList = new ArrayList<Courses>(); 
	      try {
	    	 DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 stmt = c.createStatement();
	    	 TeacherHome t = new TeacherHome();
	    	 
	    	 ResultSet rs = stmt.executeQuery( "SELECT SUBJECT, TOPIC, COURSECONTENT, HASQUIZ FROM COURSES" );
	         while ( rs.next() ) {
	            String  subject = rs.getString("SUBJECT");            
	            String  topic = rs.getString("TOPIC");
	            String hasquiz = rs.getString("HASQUIZ");
	            String content = rs.getString("COURSECONTENT");
	            Courses c1 = new Courses(subject,topic,hasquiz,content);
	            courseList.add(c1);
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	         //return courseList;
	      }catch (Exception e) {
	    	  
	      }
	      
		return courseList;
	}
	void AddQuestion(String subject, String topic, String questionBody, String choice1,String choice2,String choice3, String key) {
		Connection c = null;
	    //Statement stmt = null;
	      try {
	    	 DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 PreparedStatement stmt=c.prepareStatement("Insert into QUESTIONS (SUBJECT,TOPIC,QUESTION,CHOICE1,CHOICE2,CHOICE3,ANSWER) "
		         		+ "values (?,?,?,?,?,?,?)");  
	    	 stmt.setInt(1,101);//1 specifies the first parameter in the query  
	    	 stmt.setString(1,subject);  
	    	 stmt.setString(2,topic);   
	    	 stmt.setString(3,questionBody);  
	    	 stmt.setString(4,choice1); 
	    	 stmt.setString(5,choice2);  
	    	 stmt.setString(6,choice3); 
	    	 stmt.setString(7,key);  
	    	 stmt.executeUpdate();
	         c.close();
	      }catch (Exception e) {
	    	  
	      }
	}
	List<Questions> FetchQuestions(String subject, String topic) {
		Connection c = null;
		PreparedStatement stmt = null;
	    List <Questions> qList = new ArrayList<Questions>(); 
	      try {
	    	 DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 stmt = c.prepareStatement("SELECT * FROM QUESTIONS WHERE SUBJECT = ? AND TOPIC = ?");
	    	 stmt.setString(1,subject);
	    	 stmt.setString(2,topic);
	    	 ResultSet rs = stmt.executeQuery();
	    	 while ( rs.next() ) {
	            int id = rs.getInt("QID");
	            String  questionbody = rs.getString("QUESTION");            
	            String  choice1 = rs.getString("CHOICE1");
	            String  choice2 = rs.getString("CHOICE2");
	            String  choice3 = rs.getString("CHOICE3");
	            String  key = rs.getString("ANSWER");
	            Questions questn = new Questions(id,subject,topic,questionbody,choice1,choice2,choice3,key);
	            qList.add(questn);
	            //System.out.println(subject);
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	         //return courseList;
	      }catch (Exception e) {
	    	  
	      }
	      
		return qList;
	}
	
	String VerifyLogin(String user, String password, String role) {
		Connection c = null;
	    Statement stmt = null;
	    String validRole="invalid";
	   // System.out.println("role:"+user+password+role);
	    try {
	    	DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 stmt = c.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
	    while ( rs.next() ) {
	    	//System.out.println(rs.getString("Username")); 
            String  DBUser = rs.getString("Username");            
            String  DBPass = rs.getString("Password");
            String  DBRole = rs.getString("Role");

            if(DBUser.equalsIgnoreCase(user) && DBPass.equals(password) && DBRole.equalsIgnoreCase(role)) {
            	validRole = role;
            	break;
            }
            
         }
	    
	    	
	    rs.close();
        stmt.close();
        c.close();	

    }catch (SQLException e) {
        System.out.println(e);
        e.printStackTrace();
    }
	    
		     return validRole;
	}
	void UpdateCourse(String subject, String topic) {
		Connection c = null;
	    //Statement stmt = null;
	      try {
	    	 DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 //stmt = c.createStatement();
	    	 PreparedStatement stmt=c.prepareStatement("UPDATE COURSES SET HASQUIZ=? WHERE SUBJECT=? AND TOPIC=?");
	    	 stmt.setString(1,"Y");  
	    	 stmt.setString(2,subject); 
	    	 stmt.setString(3,topic); 
	    	 
	    	 stmt.executeUpdate();  
	         c.close();
	      }catch (Exception e) {
	    	  
	      }
	}
	void AddUser(String uname, String fname,String surname,String password, String role) {
        Connection c = null;
     Statement stmt = null;
     PreparedStatement preparedStmt = null;
       try {
         DBConnection con = new DBConnection();
         c = con.ConnectDB();
         stmt = c.createStatement();
          String sql = "Insert into users (USERNAME,PASSWORD,ROLE,NAME,FAMILYNAME) values (?,?,?,?,?)";
         
          preparedStmt = c.prepareStatement(sql);
          preparedStmt.setString(1,uname );
          preparedStmt.setString(2,password );
          preparedStmt.setString(3,role );
          preparedStmt.setString(4,fname );
          preparedStmt.setString(5,surname );
         
  
          preparedStmt.execute();
          c.close();
       }catch (Exception e) {
          
       }
 }
	void AddResult(String username, String subject,String topic,int score, String attemptdate, int total) {
     Connection c = null;
     Statement stmt = null;
     PreparedStatement preparedStmt = null;
     //System.out.println("hi"+username+subject+topic+score+attemptdate);
       try {
         DBConnection con = new DBConnection();
         c = con.ConnectDB();
         stmt = c.createStatement();
          String sql = "Insert into RESULTS (USERNAME,SUBJECT,TOPIC, SCORE, ATTEMPTDATE, TOTALSCORE) values (?,?,?,?,?,?)";
         
          preparedStmt = c.prepareStatement(sql);
          preparedStmt.setString(1,username );
          preparedStmt.setString(2,subject );
          preparedStmt.setString(3,topic );
          preparedStmt.setInt(4, score);
          preparedStmt.setString(5,attemptdate );
          preparedStmt.setInt(6, total);
  
          preparedStmt.execute();
          c.close();
         
       }catch (Exception e) {
          
       }
 }
	List<Results> FetchResults(String username) {
		Connection c = null;
		PreparedStatement stmt = null;
	    List <Results> rList = new ArrayList<Results>(); 
	      try {
	    	 DBConnection con = new DBConnection();
	    	 c = con.ConnectDB();
	    	 stmt = c.prepareStatement("SELECT * FROM RESULTS WHERE USERNAME like ?");
	    	 stmt.setString(1,username);
	    	 
	    	 ResultSet rs = stmt.executeQuery();
	    	 while ( rs.next() ) {
	    		String subject = rs.getString("SUBJECT");
	    		String topic = rs.getString("TOPIC");
	            int  score = rs.getInt("SCORE");
	            String  attemptdate = rs.getString("ATTEMPTDATE");
	            int total = rs.getInt("TOTALSCORE");
	            
	            Results results = new Results(username,subject,topic,score,attemptdate,total);
	            rList.add(results);
	            
	         }
	         rs.close();
	         stmt.close();
	         c.close();
	         //return courseList;
	      }catch (Exception e) {
	    	  
	      }
	      
		return rList;
	}
}

