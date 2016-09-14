import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by tjnome on 09.09.2016.
 */
public class main {
    public static void main(String[] args) {
        // Run code
        String YesNo = "N";
        do {
            pickAJob();
            out.println("Terminate program Y/N");
            YesNo = getStringInput();
        }
        while (!YesNo.equalsIgnoreCase("y"));
    }

    public static int getIntInput() {
        Scanner input = new Scanner(in);
        return input.nextInt();
    }

    public static String getStringInput() {
        Scanner input = new Scanner(in);
        return input.nextLine();
    }

    public static double getDoubleInput() {
        Scanner input = new Scanner(in);
        return input.nextDouble();
    }

    public static int getRandInt(int min, int max) {
        /*
        Using a custom random, we can extend this in future instead of using Math.Random that only returns
        Double that's in between 0.0 - 1.0
        */
        Random rd = new Random();
        return rd.nextInt((max - min) + 1) + min;

    }

    private static void pickAJob() {
        /* Choice what job */
        out.println("This program have five jobs. Pick one job from the list:" + lineSeparator() +
                "1 = Oppgave 1 - Utrykk" + lineSeparator() +
                "2 = Oppgave 2 - Mynt eller kron" + lineSeparator() +
                "3 = Oppgave - Stein, saks, papir" + lineSeparator() +
                "4 = Oppgave - Finn ukedag" + lineSeparator() +
                "5 = Oppgave 5 - Sammenlign priser");


        switch (getIntInput()) {
            case 1:
                new one().runOne();
                break;
            case 2:
                new two().runTwo();
                break;
            case 3:
                new three().runThree();
                break;
            case 4:
                new four().runfour();
                break;
            case 5:
                new five().runfive();
                break;
            default:
                out.println("Error. Wrong number try again");
                pickAJob();
                break;
        }
    }
}
