package com.jjang051.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add") // Add - 요청 주소 
//@WebServlet - 자바에서 쓰고 있는 매핑
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
    public Add() {
        super();
    }
    // 아래 두 메서드를 톰캣이 받아서 처리 해주는 것
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num01 = 10;
		int num02 = 20;
		int sum = num01+num02;
		
		PrintWriter out = response.getWriter(); //응답을 해준다(요청을 받았을때)
		out.println("<html>");// html을 하나 보내주겠다
		out.println("<body>");
		out.println(num01+"+"+num02+"="+sum);
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
