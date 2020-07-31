package courseDesign;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quizdesign")
public class QuizDesign  extends HttpServlet{
	public static List <Questions> questionsList = new ArrayList<Questions>();
public QuizDesign() {
        super();
}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random r = new Random(); 
		//int id = r.nextInt();
		 String subject = request.getParameter("Subject");
		 String topic = request.getParameter("Topic");
		 String questionBody = request.getParameter("QBlock");
		 String choice1 = request.getParameter("QC1");
		 String choice2 = request.getParameter("QC2");
		 String choice3 = request.getParameter("QC3");
		 String key = request.getParameter("key");
		 String action = request.getParameter("action");
			SQLStatement s = new SQLStatement();
			s.AddQuestion(subject, topic, questionBody, choice1, choice2, choice3, key);
		 
		if(action.equalsIgnoreCase("Add More")) {
			//PrintWriter out = response.getWriter();
			//out.println(subject);
			request.setAttribute("Subject", subject);
			request.setAttribute("Topic", topic);
			RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/QuizForm.jsp");
			RequetsDispatcherObj.forward(request, response);
		 }else if(action.equalsIgnoreCase("Submit")) {
			 s.UpdateCourse(subject, topic);
			 request.setAttribute("Subject", subject);
			 request.setAttribute("Topic", topic);
			 RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("PreviewQuiz");
			 RequetsDispatcherObj.forward(request, response);
			 
		 }
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
