import static java.lang.System.*;

/**
 * Created by tjnome on 09.09.2016.
 */
public class one {
    public void runOne() {

        /* Oppgave 1 */
        out.println("This job calculates average of three inputs." + lineSeparator() + "Type a number (No decimals)");
        int one = main.getIntInput();
        out.println("Type another number (No decimals)");
        int two = main.getIntInput();
        out.println("Type last number (No decimals)");
        int three = main.getIntInput();
        out.println("The Average is: " + ((double)(one + two + three) / 3));
    }
}
