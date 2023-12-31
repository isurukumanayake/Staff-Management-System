package com.sms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.model.Manager;
import com.sms.service.IManager;
import com.sms.service.ManagerDBUtil;

/**
 * Servlet implementation class ManagerViewProfileServlet
 */
@WebServlet("/ManagerViewProfileServlet")
public class ManagerViewProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerViewProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		String managerUsername = (String) session.getAttribute("mgrUname");
		
		IManager iMgr = new ManagerDBUtil();
		
		Manager manager = iMgr.getManager(managerUsername).get(0);
		
        request.setAttribute("mgr", manager);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/mgrViewProfile.jsp");
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
