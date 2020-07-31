package courseDesign;

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
import javax.servlet.http.HttpSession;

@WebServlet("/StudentQuiz")
public class StudentQuiz extends HttpServlet{
	public static List <Questions> questionsList = new ArrayList<Questions>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String subject = session.getAttribute("Subject").toString();
		String topic = session.getAttribute("Topic").toString();
		  
		Questions q = new Questions();
		SQLStatement sql = new SQLStatement();
		questionsList = sql.FetchQuestions(subject, topic);
		int sz = questionsList.size();
		if(sz==0) {
			request.setAttribute("StudentMessage", "Oops quiz is still not available!!!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("DownloadSuccess.jsp");
	        dispatcher.forward(request, response);
		}
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	      
	     String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head>"
	         +"<style>\r\n" + 
	         ".intructions {\r\n" + 
	         "  border: 2px outset red;\r\n" + 
	         "  background-color: lightblue;    \r\n" + 
	         "  text-align: center;\r\n" + 
	         "}\r\n" + 
	         ".button {\r\n" + 
	         "  background-color: #4CAF50;\r\n" + 
	         "  border: none;\r\n" + 
	         "  color: white;\r\n" + 
	         "  padding: 15px 32px;\r\n" + 
	         "  text-align: center;\r\n" + 
	         "  text-decoration: none;\r\n" + 
	         "  display: inline-block;\r\n" + 
	         "  font-size: 16px;\r\n" + 
	         "  margin: 4px 2px;\r\n" + 
	         "  cursor: pointer;\r\n" + 
	         "}"+
	         "</style>"
	            + "</head>\n" +
	            "<body><form method='get' action='CalculateResult'>"
	            + "<div height=100% style=\"background-image: url('images/bg-02.jpg');\">"
	            
	            + "<div align=\"center\"><label for='option-11' style=' padding: 5px; font-size: 3.5rem;background-color: #A9CCE3;'>Take Assessment</label></div>");
	      out.println("<br><div style=\"background-color: #A9CCE3;border: 2px outset red;\">"
          + "<h3 align='center'>Quiz Instructions</h3>"
          +"<ul><li>The quizzes consists of questions carefully designed to help you self-assess your comprehension of the information presented on the topics covered in the module.</li> "
          +"<li>Each question in the quiz is of multiple-choice format. Read each question carefully, and click on the button next to your response that is based on the information covered on the topic in the module.</li>"
          + "<li>At the end of the test you will see appropriate feedback for each question along with total score obtained</li>"
          + "</ul>"
          + "<br><br></div>");
	            for(int i=0;i<sz;i++){
	            	q = questionsList.get(i);
	            	
	            out.println("<div id='block-11' style='padding: 10px;'>"
	            		+ "<div name='radiogroup'"+i+1+"><label for='option-11' style=' padding: 5px; font-size: 2.0rem;'>Question: "
	            		+q.getQuestionBody()+"</label></br></br>"+
	            	"<input type='radio' style='transform: scale(1.6); margin-right: 10px; vertical-align: middle; margin-top: -2px;' name='ans"+i+"' value='" + q.getChoice1()+"'><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+q.getChoice1()+"</label></br>"+
	            	"<input type='radio' style='transform: scale(1.6); margin-right: 10px; vertical-align: middle; margin-top: -2px;' name='ans"+i+"' value='" + q.getChoice2()+"'><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+q.getChoice2()+"</label></br>"+
	            	"<input type='radio' style='transform: scale(1.6); margin-right: 10px; vertical-align: middle; margin-top: -2px;' name='ans"+i+"' value='" + q.getChoice3()+"'><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+q.getChoice3()+"</label>"+
	            		"</div></div><hr/>");
	            
	            }
	            //out.println("</td><td><img src='/VidyaMitra/images/gif/ethink.gif'></img></td></tr></table>");
	            out.println("<div align=\"center\"><input type='submit' class='button' name=\"submit\" value=\"Submit\"></div>");
	      out.println("</body></form>"+
	         "</html>");
	     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}
}
