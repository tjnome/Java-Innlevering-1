import static java.lang.System.out;

/**
 * Created by tjnome on 09.09.2016.
 */
public class two {
    public static void runTwo() {

        /* Oppgave 2 */
        out.println("This job give you a chance to guess if the output is Mynt or Krone (50% chance)");
        String sInput = main.getStringInput();

        switch (main.getRandInt(0, 1)) {
            case 0:
                if (sInput.equalsIgnoreCase("mynt"))
                    out.println("Well done. You guess correct");
                else
                    out.println("You guess wrong");
                break;
            case 1:
                if (sInput.equalsIgnoreCase("krone"))
                    out.println("Well done. You guess correct");
                else
                    out.println("You guess wrong");
                break;
            default:
                out.println("Something went wrong!");
                break;
        }
    }
}
