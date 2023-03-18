package controller;

import model.User;
import service.LoginService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    LoginService service = new LoginService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        if(action.equals("/login")) {
            response.setContentType("html/text");
            response.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(action.equals("/login")) {
            if (username == null || password == null) {
                request.setAttribute("message", "'Loi dang nhap");
                request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
            }
        }
    }
}
