package com.example.severtime;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServerTimeServlet", urlPatterns = "/index")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Hello world</h1>");
//        writer.println("</html>");
//    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println(("<html>"));

        Date today = new Date();

        writer.println("<h1>" + today + "<h1>");
        writer.println("</html>");
    }

    public void destroy() {
        System.out.println("Đã xong !");
    }

}