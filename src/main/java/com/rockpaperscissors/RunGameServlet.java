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
import java.util.Map;
import java.util.TreeMap;

@WebServlet(
        name = "rungame",
        urlPatterns = "/go"
)
public class RunGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Integer> scoreboard = new TreeMap<String, Integer>();

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

        // writing down the scoreboard
        for (Player player : game.getPlayers()) {

            scoreboard.put(player.whoIs(), 0);

        }
        scoreboard.put("tie", 0);

        for (int i = 0; i < 100; i++) {

            ArrayList<Player> winners = game.whoWins();

            if (winners.size() == 1) {

                // we have a winner
                scoreboard.put(winners.get(0).whoIs(), scoreboard.get(winners.get(0).whoIs()) + 1);

            } else if (winners.size() == game.getPlayers().size()) {

                // that is a tie game
                scoreboard.put("tie", scoreboard.get("tie") + 1);


            } else {

                // can more than 2 play? I thing so, let's make it a big group
                // todo: need to implement feature to process multiple (more than 2) players

            }

        }

        // just some boring view code
        req.setAttribute("scoreboard", scoreboard);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }

}