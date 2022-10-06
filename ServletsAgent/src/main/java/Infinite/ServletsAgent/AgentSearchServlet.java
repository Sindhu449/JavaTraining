package Infinite.ServletsAgent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class AgentSearchServlet
 */
public class AgentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int agentId = Integer.parseInt(request.getParameter("agentId"));
		AgentDAO dao = new AgentDAO();
		try {
			Agent agent = dao.searchAgent(agentId);
			if(agent!=null){
				out.println("Agent Id " +agent.getAgentId()+ "<br/>");
				out.println("Agent Name " +agent.getName()+ "<br/>");
				out.println("Agent City " +agent.getCity()+ "<br/>");
				out.println("Agent MaritalStatus" +agent.getMaritalStatus()+ "<br/>");
				out.println("Agent Premium " +agent.getPremium()+ "<br/>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
