package application;

import webFilter.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "inlog")
public class inlog extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Person person = new Person();

        request.setAttribute("user", request.getParameter("signonname"));
        request.setAttribute("password", request.getParameter("password"));

        if (person.isValidPerson(request.getParameter("signonname"), request.getParameter("password"))) {
            request.getRequestDispatcher("/Entrance.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "UNAUTORIZED ACCESS : invalid access credentials. Please re-enter");
            request.getRequestDispatcher("/inlog.jsp").forward(request, response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        PrintWriter out = response.getWriter();
        out.print("signon-name" + request.getParameter("signonname") + "Access Credentials:" + request.getParameter("password"));

    }
}
