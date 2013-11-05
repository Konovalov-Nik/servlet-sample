package ru.sgu.sample.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Nikita Konovalov
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/hello.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        ServletOutputStream outputStream = resp.getOutputStream();

        outputStream.println("<html>");
        outputStream.println("<body>");
        outputStream.println("<h2>Hello, " + firstName + " " + lastName + " </h2>");
        outputStream.println("</body>");
        outputStream.println("</html>");

    }
}
