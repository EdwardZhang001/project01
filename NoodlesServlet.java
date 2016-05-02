package com.netease;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.Kitchen;

public class NoodlesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String vegetable = request.getParameter("vegetable");
        String noodles = Kitchen.makeNoodles(vegetable);
        writer.println(noodles);
    }
<<<<<<< HEAD
    
    private void Function1(String s){
    	//This is a new function
    	System.out.println(s);
    }
=======
>>>>>>> bbcb24411ef6337438183420e3cc06ae7de3e87d
}
