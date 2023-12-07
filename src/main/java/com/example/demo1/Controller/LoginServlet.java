package com.example.demo1.Controller;

import com.example.demo1.Model.Accout;
import com.example.demo1.Service.ManageAccout;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "a", value = "/login")
public class LoginServlet extends HttpServlet {
    ManageAccout manageAccout = new ManageAccout();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "error!";
        }
        switch (action) {
            default:
                showLogin(request, response);
                break;
        }
    }

    private void showLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/login.jsp");
        List<Accout> list = manageAccout.showListAccout();
        request.setAttribute("list", list);
        requestDispatcher.forward(request, response);
    }
}
