package com.example.demo1.Controller;


import com.example.demo1.Model.Page;
import com.example.demo1.Service.ManageSevice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "blog", value = "/home")


public class HomeServlet extends HttpServlet {
    ManageSevice manageSevice = new ManageSevice();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "lỗi";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showList(request, response)
                ;
                break;

        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        manageSevice.delete(id);
        response.sendRedirect("/blog");
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher r = request.getRequestDispatcher("blog/list.jsp");
        List<Page> list = manageSevice.showALl();
        request.setAttribute("List", list);
        r.forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/create.jsp");
        requestDispatcher.forward(request, response);
    }
}