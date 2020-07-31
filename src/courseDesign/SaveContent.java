package courseDesign;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.html2pdf.HtmlConverter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SaveContent")
public class SaveContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SaveContent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("submit");
		
		if(action.equalsIgnoreCase("submit")) {
			String subj = request.getParameter("subject");
			String tpc = request.getParameter("topic");
			String datasent = request.getParameter("courseContent");
			
			SQLStatement s = new SQLStatement();
			s.AddCourse(subj,tpc,datasent);
			
		    try{
		        HtmlConverter.convertToPdf(datasent, new FileOutputStream("D:/"+subj+"_"+tpc+".pdf"));	         
		    }catch(Exception ex){
		        ex.printStackTrace();
		    }
		    String TeacherMessage = subj +"_" + tpc+" is downloaded in your D: drive.";
			request.setAttribute("TeacherMessage", TeacherMessage);
		    RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("DownloadSuccessTeacher.jsp");
			RequetsDispatcherObj.forward(request, response); 

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		System.out.println("post");
		
	}

}

