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
import javax.servlet.http.HttpSession;

import com.itextpdf.html2pdf.HtmlConverter;

/**
 * Servlet implementation class StudentFeatures
 */
@WebServlet("/StudentFeatures")
public class StudentFeatures extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List <Courses> courseList = new ArrayList<Courses>(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFeatures() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] course=request.getParameter("course").split(":");
		if(request.getParameter("Submit").equalsIgnoreCase("Download")) {
		SQLStatement s = new SQLStatement();
		courseList=s.FetchCourse();
		
		Courses c = new Courses();
		String pdf="";
		for(int i=0;i<courseList.size();i++) {
  		  c = courseList.get(i);
  		 
  		  if(c.getSubject().equalsIgnoreCase(course[0]) && c.getTopic().equalsIgnoreCase(course[1])) {
  			  pdf=c.getContent();
  			  break;
  		  }
		}
  		  
		HtmlConverter.convertToPdf(pdf, new FileOutputStream("D:/"+course[0]+"_"+course[1]+".pdf"));
		request.setAttribute("StudentMessage", course[0] + "_"+course[1]+" is downloaded in your D: drive.");
		RequestDispatcher dispatcher = request.getRequestDispatcher("DownloadSuccess.jsp");
        dispatcher.forward(request, response);
		}
		if(request.getParameter("Submit").equalsIgnoreCase("Quiz")) {
			HttpSession session = request.getSession();
	        session.setAttribute("Subject", course[0]);
	        session.setAttribute("Topic", course[1]);
	        // response.sendRedirect("index.jsp");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/StudentQuiz");
	        dispatcher.forward(request, response);
		}
		if(request.getParameter("Submit").equalsIgnoreCase("Result")) {
			
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/ResultLoad");
	        dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
