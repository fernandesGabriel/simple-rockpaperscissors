package com.rockpaperscissors;

import com.rockpaperscissors.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(
        name = "rungame",
        urlPatterns = "/go"
)
public class RunGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {

        // who is playing?
        Player player1 = new Player("Player A");
        Player player2 = new Player("Player B");

        // teach them the rules
        player1.teachRule(new PaperRule());
        player2.teachRule(new PaperRule());
        player2.teachRule(new RockRule());
        player2.teachRule(new ScissorsRule());

        // let's play
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);

        Player winner = game.whoWins();

        // todo: loop through 100 games and see who is the all time winner and the scores

        // just some boring view code
        req.setAttribute("winner", winner.whoIs());
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }

}