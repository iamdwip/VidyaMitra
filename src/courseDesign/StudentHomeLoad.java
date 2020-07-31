package courseDesign;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentHomeLoad
 */
@WebServlet("/StudentHomeLoad")
public class StudentHomeLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List <Courses> courseList = new ArrayList<Courses>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentHomeLoad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 SQLStatement sq = new SQLStatement();
		 courseList=sq.FetchCourse();
		 request.setAttribute("Courselist", courseList);
		 
         RequestDispatcher dispatcher = request.getRequestDispatcher("StudentHome.jsp");
         dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
