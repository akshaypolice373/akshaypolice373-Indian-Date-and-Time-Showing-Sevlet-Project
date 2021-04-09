 package com.Akshay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
    public DateServlet() {
        System.out.println("In DS no argument constructor");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In DS-> doGet()");
		
//		 there is no dep on user inputs 
//		apply business logic to create current date and time 
//		Generate HTML dynamic resource
//		write the response into response body 
		
		String[] quotes = {"today is a good day","To be or not to be is the question","your measure a person is not based on reaults but how he sits, eats, walks, talks", "tatvam asi", "aham bramhasmi"};

		Date dt = new Date();
		String html = "<html><body><h1>Date & Time </h1><b>Today's date & time is " + dt.toString() + "</b><br/> Quate of the day : " + quotes[(int)(Math.random()*quotes.length)]+ "</body></html>";
		System.out.println(html);
		PrintWriter pw = response.getWriter();
		pw.write(html);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
