package courseDesign;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CalculateResult")
public class CalculateResult extends HttpServlet{
	public static List <Questions> questionsList = new ArrayList<Questions>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);  
        String subject=(String)session.getAttribute("Subject");
        String topic=(String)session.getAttribute("Topic");
        String username=(String)session.getAttribute("username");
        
		//System.out.println("get"+subject);
		Questions q = new Questions();
		SQLStatement sql = new SQLStatement();
		questionsList = sql.FetchQuestions(subject, topic);
		int sz = questionsList.size();
		String resulttext;
		int marks =0;
		
		for(int i=0;i<sz;i++){
        	q = questionsList.get(i);
        	if(q.getKey().equalsIgnoreCase(request.getParameter("ans"+i))) {
         		marks = marks +1;
        	}
		}
		SQLStatement s = new SQLStatement();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime attemptdate = LocalDateTime.now();
		s.AddResult(username, subject, topic, marks, attemptdate.toString(),sz);
		
		if(marks/sz*100>=60) {
			resulttext= "Congratulations!!! You have scored "+marks + " out of " + sz;
		}else {
			resulttext= "Oops!!! You have scored "+marks + " out of " + sz+ ". Retake test to score better";
		}
		PrintWriter out = response.getWriter();
	    String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html>\n"+
	    	  "<div class=\"container-login100\" style=\"background-image: url('images/bg-02.jpg');\">"+
	    	  "<!-- Basic -->\r\n" + 
	    	  "    <meta charset=\"utf-8\">\r\n" + 
	    	  "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \r\n" + 
	    	  "   \r\n" + 
	    	  "    <!-- Mobile Metas -->\r\n" + 
	    	  "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
	    	  " \r\n" + 
	    	  "     <!-- Site Metas -->\r\n" + 
	    	  "    <title>VidyaMitra -Student Home</title>  \r\n" + 
	    	  "    <meta name=\"keywords\" content=\"\">\r\n" + 
	    	  "    <meta name=\"description\" content=\"\">\r\n" + 
	    	  "    <meta name=\"author\" content=\"\">\r\n" + 
	    	  "\r\n" + 
	    	  "    <!-- Site Icons -->\r\n" + 
	    	  "    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\r\n" + 
	    	  "    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n" + 
	    	  "\r\n" + 
	    	  "    <!-- Bootstrap CSS -->\r\n" + 
	    	  "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n" + 
	    	  "    <!-- Site CSS -->\r\n" + 
	    	  "    <link rel=\"stylesheet\" href=\"style.css\">\r\n" + 
	    	  "    <!-- ALL VERSION CSS -->\r\n" + 
	    	  "    <link rel=\"stylesheet\" href=\"css/versions.css\">\r\n" + 
	    	  "    <!-- Responsive CSS -->\r\n" + 
	    	  "    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n" + 
	    	  "    <!-- Custom CSS -->\r\n" + 
	    	  "    <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n" + 
	    	  "\r\n" + 
	    	  "    <!-- Modernizer for Portfolio -->\r\n" + 
	    	  "    <script src=\"js/modernizer.js\"></script>\r\n" + 
	    	  "\r\n" + 
	    	  "    <!--[if lt IE 9]>\r\n" + 
	    	  "      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n" + 
	    	  "      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n" + 
	    	  "    <![endif]-->\r\n" + 
	    	  "\r\n" + 
	    	  "</head>\r\n" + 
	    	  "<body class=\"host_version\"> \r\n" + 
	    	  "\r\n" + 
	    	  
	    	  "	\r\n" + 
	    	  "	\r\n" + 
	    	  "	<!-- Start header -->\r\n" + 
	    	  "			<header class=\"top-navbar\">\r\n" + 
	    	  "		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n" + 
	    	  "			<div class=\"container-fluid\">\r\n" + 
	    	  "				<a class=\"navbar-brand\" href=\"Login.jsp\">\r\n" + 
	    	  "					<img src=\"images/logo.png\" alt=\"\" />\r\n" + 
	    	  "				</a>\r\n" + 
	    	  "				<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbars-host\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
	    	  "					<span class=\"icon-bar\"></span>\r\n" + 
	    	  "                    <span class=\"icon-bar\"></span>\r\n" + 
	    	  "                    <span class=\"icon-bar\"></span>\r\n" + 
	    	  "				</button>\r\n" + 
	    	  "				<div class=\"collapse navbar-collapse\" id=\"navbars-host\">\r\n" + 
	    	  "					<ul class=\"navbar-nav ml-auto\">\r\n" + 
	    	  "						\r\n" + 
	    	  "						<li class=\"nav-item\"><a class=\"nav-link\" href='/VidyaMitra/StudentHomeLoad'>Home</a></li>\r\n" + 
	    	  "						\r\n" + 
	    	  "					</ul>\r\n" + 
	    	  "					<ul class=\"nav navbar-nav navbar-right\">\r\n" + 
	    	  "                        <li><a class=\"hover-btn-new log orange\" href=\"Login.jsp\" data-toggle=\"modal\" data-target=\"#login\"><span>Log Out</span></a></li>\r\n" + 
	    	  "                    </ul>\r\n" + 
	    	  "				</div>\r\n" + 
	    	  "			</div>\r\n" + 
	    	  "		</nav>\r\n" + 
	    	  "	</header>\r\n" + 
	    	  "	<!-- End header -->"+
	  "<div align=\"center\"><label for='option-11' style=' padding: 5px; font-size: 3.5rem;'>Assessment Result</label></div>"+
	  "<div align=\"center\"><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+resulttext+"</label></div>"+
	    		  "<table>");
	      for(int i=0;i<sz;i++){
        	q = questionsList.get(i);
        	if(q.getKey().equalsIgnoreCase(request.getParameter("ans"+i))) {
         		
         		out.println("<div id='block-11' style='padding: 10px;'>"
	            		+ "<tr><td><label for='option-11' style=' padding: 5px; font-size: 2.0rem;'> "
	            		+q.getQuestionBody()+"</label></td>"
	            		+"<td><img src='/VidyaMitra/images/tick.jpg' height='30'></img></td></tr>");
         	}else {
         		
         		out.println("<div id='block-11' style='padding: 10px;'>"
	            		+ "<tr><td><label for='option-11' style=' padding: 5px; font-size: 2.0rem;'> "
	            		+q.getQuestionBody()+"</label></td>"
	            		+"<td><img src='/VidyaMitra/images/cross.png' height='30'></img></td></tr>");
         	}
        	out.println("</div>");
	            }
		
		out.println("</table>");
		out.println("</body></html>");
        	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}
}
