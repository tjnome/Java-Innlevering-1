import static java.lang.System.*;

/**
 * Created by tjnome on 09.09.2016.
 */
public class three {
    public static void runThree() {
        /* Oppgave 3 */

        String[][] moves = {{"rock", "paper",},
                {"scissors", "rock",},
                {"paper", "scissors",},
        };

        out.println("This job plays rock, paper scissor!" + lineSeparator() +
                "Choose: Rock, Paper or Scissor");

        int randomNr = main.getRandInt(0,2);
        String sInput = main.getStringInput();

        if (sInput.equalsIgnoreCase(moves[randomNr][0]))
            out.println("AI Picked: " + moves[randomNr][0] + lineSeparator() + "Its a tie!");
        else if (sInput.equalsIgnoreCase(moves[randomNr][1]))
            out.println("AI Picked: " + moves[randomNr][0] + lineSeparator() + "You win!");
        else
            out.println("AI Picked: " + moves[randomNr][0] + lineSeparator() + "You lose");
    }
}
