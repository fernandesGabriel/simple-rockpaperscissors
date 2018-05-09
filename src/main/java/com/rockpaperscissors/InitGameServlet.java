package com.rockpaperscissors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "initgame",
        urlPatterns = "/"
)
public class InitGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // just some boring view code
        RequestDispatcher view = req.getRequestDispatcher("init.jsp");
        view.forward(req, resp);

    }

}
