import static java.lang.System.lineSeparator;
import static java.lang.System.out;

/**
 * Created by tjnome on 09.09.2016.
 */
public class five {
    public void runfive() {

        /* Oppgave 5 */
        out.println("This job calculates the differense between to packages (Weight and Pris)." + lineSeparator() + "Type Weight for first package");
        double w1 = main.getDoubleInput();
        out.println("Type Price for first package");
        double p1 = main.getDoubleInput();
        out.println("Type Weight for second package");
        double w2 = main.getDoubleInput();
        out.println("Type Price for second package");
        double p2 = main.getDoubleInput();

        double calc1 = (p1 / w1);
        double calc2 = (p2 / w2);
        out.println("The price in weight/price:" + lineSeparator() + "Package 1: " + calc1 + lineSeparator() + "Package 2: " + calc2);

        if (calc1 < calc2)
            out.println("Best price is package 1");
        else if (calc1 > calc2)
            out.println("Best Price is package 2");
        else
            out.println("Package have same price in total");
    }
}
