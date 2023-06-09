package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/apple")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ForwardServlet() {
        super();

    }

    /* get방식이면 여기 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("실행 됨~~~~~~~~~~~~");
		
		// 리다이렉트
		// response.sendRedirect("actionTag/forward_ex02_ok.jsp"); 
		 
		//포워드 - 나갈 경로 필요
		//RequestDispatcher dp = request.getRequestDispatcher("actionTag/forward_ex02_ok.jsp");
		//dp.forward(request, response);
		
		// 간결하게
		request.getRequestDispatcher("actionTag/forward_ex02_ok.jsp").forward(request, response);
	}

	
	/* post방식이면 여기 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
