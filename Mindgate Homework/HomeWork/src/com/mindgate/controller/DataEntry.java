package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DataEntry")
public class DataEntry extends HttpServlet 
{
	String choice;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String name = request.getParameter("firstname");
		
		String sirname = request.getParameter("lastname");
		
		PrintWriter out = response.getWriter();

		 out.println("My name is "+name+" "+sirname);
		 choice = request.getParameter("gen");
		
		switch(choice)
		{
		case "male":out.println("Gender: male");
		break;
		
		case "female": out.println("Gender: female");
		break;
		}
		
		 choice = request.getParameter("qua");
		 switch(choice)
		 {
		 case "ssc" : out.println("Qualification: ssc");
		 break;
		 
		 case "hsc": out.println("Qualification: hsc");
		 break;
		 
		 case "degree" : out.println("Qualification: degree");
		 break;
		 }
		 
		 choice = request.getParameter("lan");
		 switch(choice)
		 {
		 case "Hindi" : out.println("Languages Known: Hindi");
		 break;
		 
		 case "Marathi": out.println("Languages Known: Marathi");
		 break;
		 
		 case "English" : out.println("Languages Known: English");
		 break;
		 
		 case "Others" : out.println("Languages Known: Others");
		 break;
		 }
		 
		
		
	}

}
