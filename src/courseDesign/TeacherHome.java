package courseDesign;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.html2pdf.HtmlConverter;
@WebServlet("/TeacherHome")
public class TeacherHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List <Courses> courseList = new ArrayList<Courses>(); 
    public TeacherHome() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Courses c = new Courses();
		 SaveContent s = new SaveContent();
		 SQLStatement sq = new SQLStatement();
		 courseList=sq.FetchCourse();
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         
	    	  "<html lang=\"en\">\r\n" + 
	    	  "\r\n" + 
	    	  "    <!-- Basic -->\r\n" + 
	    	  "    <meta charset=\"utf-8\">\r\n" + 
	    	  "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \r\n" + 
	    	  "   \r\n" + 
	    	  "    <!-- Mobile Metas -->\r\n" + 
	    	  "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
	    	  " \r\n" + 
	    	  "     <!-- Site Metas -->\r\n" + 
	    	  "    <title>VidyaMitra -Teacher Home</title>  \r\n" + 
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
	    	  "<body class=\"host_version\" > \r\n" + 
	    	  "\r\n" + 
	    	  "    <!-- LOADER -->\r\n" + 
	    	  "	<div id=\"preloader\">\r\n" + 
	    	  "		<div class=\"loader-container\">\r\n" + 
	    	  "			<div class=\"progress-br float shadow\">\r\n" + 
	    	  "				<div class=\"progress__item\"></div>\r\n" + 
	    	  "			</div>\r\n" + 
	    	  "		</div>\r\n" + 
	    	  "	</div>\r\n" + 
	    	  "	<!-- END LOADER -->	\r\n" + 
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
	    	  "						<li class=\"nav-item\"><a class=\"nav-link\" href=\"\">Home</a></li>\r\n" + 
	    	  "						\r\n" + 
	    	  "					</ul>\r\n" + 
	    	  "					<ul class=\"nav navbar-nav navbar-right\">\r\n" + 
	    	  "                        <li><a class=\"hover-btn-new log orange\" href=\"/Login.jsp\" data-toggle=\"modal\" data-target=\"#login\"><span>Log Out</span></a></li>\r\n" + 
	    	  "                    </ul>\r\n" + 
	    	  "				</div>\r\n" + 
	    	  "			</div>\r\n" + 
	    	  "		</nav>\r\n" + 
	    	  "	</header>\r\n" + 
	    	  "	<!-- End header -->\r\n" + 
	    	  "	\r\n" + 
	    	  "	\r\n" + 
	    	  "	<div id=\"carouselExampleControls\" class=\"carousel slide bs-slider box-slider\" data-ride=\"carousel\" data-pause=\"hover\" data-interval=\"false\" >\r\n" + 
	    	  "		<!-- Indicators -->\r\n" + 
	    	  "		<ol class=\"carousel-indicators\">\r\n" + 
	    	  "			<li data-target=\"#carouselExampleControls\" data-slide-to=\"0\" class=\"active\"></li>\r\n" + 
	    	  "			<li data-target=\"#carouselExampleControls\" data-slide-to=\"1\"></li>\r\n" + 
	    	  "			<li data-target=\"#carouselExampleControls\" data-slide-to=\"2\"></li>\r\n" + 
	    	  "		</ol>\r\n" + 
	    	  "		<div class=\"carousel-inner\" role=\"listbox\">\r\n" + 
	    	  "			<div class=\"carousel-item active\">\r\n" + 
	    	  "				<div id=\"home\" class=\"first-section\" style=\"background-image:url('images/slider-01.jpg');\">\r\n" + 
	    	  "					<div class=\"dtab\">\r\n" + 
	    	  "						<div class=\"container\">\r\n" + 
	    	  "							<div class=\"row\">\r\n" + 
	    	  "								<div class=\"col-md-12 col-sm-12 text-right\">\r\n" + 
	    	  "									<div class=\"big-tagline\">\r\n" + 
	    	  "										<h2><strong>VidyaMitra </strong></h2>\r\n" + 
	    	  "										<p class=\"lead\">Learn New Things. </p>\r\n" + 
	    	  "									</div>\r\n" + 
	    	  "								</div>\r\n" + 
	    	  "							</div><!-- end row -->            \r\n" + 
	    	  "						</div><!-- end container -->\r\n" + 
	    	  "					</div>\r\n" + 
	    	  "				</div><!-- end section -->\r\n" + 
	    	  "			</div>\r\n" + 
	    	  "			<div class=\"carousel-item\">\r\n" + 
	    	  "				<div id=\"home\" class=\"first-section\" style=\"background-image:url('images/slider-02.jpg');\">\r\n" + 
	    	  "					<div class=\"dtab\">\r\n" + 
	    	  "						<div class=\"container\">\r\n" + 
	    	  "							<div class=\"row\">\r\n" + 
	    	  "								<div class=\"col-md-12 col-sm-12 text-left\">\r\n" + 
	    	  "									<div class=\"big-tagline\">\r\n" + 
	    	  "										<h2><strong>VidyaMitra </strong></h2>\r\n" + 
	    	  "										<p class=\"lead\">Enhance your Knowledge. </p>\r\n" + 
	    	  "									</div>\r\n" + 
	    	  "								</div>\r\n" + 
	    	  "							</div><!-- end row -->            \r\n" + 
	    	  "						</div><!-- end container -->\r\n" + 
	    	  "					</div>\r\n" + 
	    	  "				</div><!-- end section -->\r\n" + 
	    	  "			</div>\r\n" + 
	    	  "			<div class=\"carousel-item\">\r\n" + 
	    	  "				<div id=\"home\" class=\"first-section\" style=\"background-image:url('images/slider-03.jpg');\">\r\n" + 
	    	  "					<div class=\"dtab\">\r\n" + 
	    	  "						<div class=\"container\">\r\n" + 
	    	  "							<div class=\"row\">\r\n" + 
	    	  "								<div class=\"col-md-12 col-sm-12 text-center\">\r\n" + 
	    	  "									<div class=\"big-tagline\">\r\n" + 
	    	  "										<h2><strong>VidyaMitra </strong></h2>\r\n" + 
	    	  "										<p class=\"lead\">Resolve your queries. </p>\r\n" + 
	    	  "									</div>\r\n" + 
	    	  "								</div>\r\n" + 
	    	  "							</div><!-- end row -->            \r\n" + 
	    	  "						</div><!-- end container -->\r\n" + 
	    	  "					</div>\r\n" + 
	    	  "				</div><!-- end section -->\r\n" + 
	    	  "			</div>\r\n" + 
	    	  "			<!-- Left Control -->\r\n" + 
	    	  "			<a class=\"new-effect carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\r\n" + 
	    	  "				<span class=\"fa fa-angle-left\" aria-hidden=\"true\"></span>\r\n" + 
	    	  "				<span class=\"sr-only\">Previous</span>\r\n" + 
	    	  "			</a>\r\n" + 
	    	  "\r\n" + 
	    	  "			<!-- Right Control -->\r\n" + 
	    	  "			<a class=\"new-effect carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\r\n" + 
	    	  "				<span class=\"fa fa-angle-right\" aria-hidden=\"true\"></span>\r\n" + 
	    	  "				<span class=\"sr-only\">Next</span>\r\n" + 
	    	  "			</a>\r\n" + 
	    	  "		</div>\r\n" + 
	    	  "	</div>\r\n" + 
	    	  "	\r\n" + 
	    	  "\r\n" + 
	    	  "    <div id=\"plan\" class=\"section lb\">" + 
	    	  "        <div class=\"container\">\r\n" + 
	    	  "            <div class=\"section-title text-center\">\r\n" + 
	    	  "                <h3>Teacher Home Page</h3>\r\n" + 
	    	  "                                            <h2>Available Courses</h2>\r\n" + 
	    	  "<a class=\"hover-btn-new log orange\" align='center' href='/VidyaMitra/ContentDesignForm.jsp'><font style='color:0F9048'><b>Add New Content</b></font></a>"+
	    	  "            </div><!-- end title -->\r\n" + 
	    	  "            <hr class=\"invis\">\r\n" + 
	    	  "\r\n" + 

	    	
	    	 
	    	 
	    	  "                                          <table id='TeacherCourses'>\r\n" + 
	    	  "                                          <tr><th> Subject</th><th>Topic</th><th>Action</th></tr>\r\n");                                        
	    	 
	         
	    	if(courseList.isEmpty())  {
	    		out.println("<h3>No data to display</h3>");
	    	}else {
	    		
	      for(int i=0;i<courseList.size();i++) {
	    		  c = courseList.get(i);
	    		  String quiz=c.getHasQuiz();
	    		  String action="";
	    		  if(quiz.equalsIgnoreCase("N")) {
	    			  action = "<td><a class=\"hover-btn-new log orange\" href='/VidyaMitra/QuizForm.jsp?Subject=" +c.getSubject()+
		    				  "&Topic="+c.getTopic()+"'><font style='color:0F9048'><b>Add Quiz</b></font></a></td></tr>";
	    		  }else {
	    			  action = "<td>Quiz Available</td></tr>";
	    		  }
	    		  
	    		  out.println("<tr><td>" + c.getSubject() + "</td><td>" + c.getTopic()+
	    				  "</td>"+ action );
	    	 
	    	  }
	    	}
	    	out.println("</table>  \r\n" + 
	    			
	    			"        </div><!-- end container -->\r\n" + 
	    			"    </div><!-- end section -->\r\n" + 
	    			"    <a href=\"#\" id=\"scroll-to-top\" class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\r\n" + 
	    			"    <style>"+ 
	    			"#TeacherCourses {\r\n" + 
	    			"  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n" + 
	    			"  border-collapse: collapse;\r\n" + 
	    			"  width: 100%;\r\n" + 
	    			"}\r\n" + 
	    			"\r\n" + 
	    			"#TeacherCourses td, #customers th {\r\n" + 
	    			"  border: 1px solid #ddd;\r\n" + 
	    			"  padding: 8px;\r\n" + 
	    			"}\r\n" + 
	    			"\r\n" + 
	    			"#TeacherCourses tr:nth-child(even){background-color: #f2f2f2;}\r\n" + 
	    			"\r\n" + 
	    			"#TeacherCourses tr:hover {background-color: #ddd;}\r\n" + 
	    			"\r\n" + 
	    			"#TeacherCourses th {\r\n" + 
	    			"  padding-top: 12px;\r\n" + 
	    			"  padding-bottom: 12px;\r\n" + 
	    			"  text-align: left;\r\n" + 
	    			"  background-color: #4CAF50;\r\n" + 
	    			"  color: white;\r\n" + 
	    			"}\r\n" + 
	    			""+
	    			"</style>\r\n" + 
	    			"\r\n" + 
	    			"    <!-- ALL JS FILES -->\r\n" + 
	    			"    <script src=\"js/all.js\"></script>\r\n" + 
	    			"    <!-- ALL PLUGINS -->\r\n" + 
	    			"    <script src=\"js/custom.js\"></script>\r\n" + 
	    			"	<script src=\"js/timeline.min.js\"></script>\r\n" + 
	    			"	<script>\r\n" + 
	    			"		timeline(document.querySelectorAll('.timeline'), {\r\n" + 
	    			"			forceVerticalMode: 700,\r\n" + 
	    			"			mode: 'horizontal',\r\n" + 
	    			"			verticalStartPosition: 'left',\r\n" + 
	    			"			visibleItems: 4\r\n" + 
	    			"		});\r\n" + 
	    			"	</script>\r\n" + 
	    			"</body>\r\n" + 
	    			"</html>");
	      out.println("");
	       
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	}
}
