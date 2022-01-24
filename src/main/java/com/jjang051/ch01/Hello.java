package com.jjang051.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//jsp는 일반적인 html 파일에 java파일을 쓰는 것
//Servlet은 java파일에 html파일을 쓰는 것
@WebServlet("/Hello")// 자바 파일 생성
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Hello() {
        super();
    }// get 파일 형식이면 아래로 request - 브라우저가 요청을 보내오는 것 response - 요청을 받아서 처리하는 것(응답)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); //화면에 그려줄때
		out.println("<html>");// html을 하나 보내주겠다
		out.println("<body>");
		out.println("<h1>Hello Jsp Get</h1>");
		out.println("</body>");
		out.println("</html>");
	}// post형식이면 아래로 보여 주겠다
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); //화면에 그려줄때
		out.println("<html>");// html을 하나 보내주겠다
		out.println("<body>");
		out.println("<h1>Hello Jsp Post</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
