import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.*;

/**
 * Created by tjnome on 09.09.2016.
 */
public class four {
    public void runfour() {

        /* Oppgave 4 */

        out.println("This job prints out the day of the week." + lineSeparator() + "Write day of the month (1-31): ");
        int q = main.getIntInput();
        out.println("Write what month it is (1-12): ");
        int m = main.getIntInput();
        out.println("Write what century we belong to: ");
        int c = main.getIntInput();

        /* Calculation */
        if (m == 1)
            m = 13;
        if (m == 2)
            m = 14;

        int h = ((q + ((26 * (m + 1)) / 10) + (c%100) + ((c%100)/4) + ((c/100)/4) + (5 * (c/100)))%7);

        String day;

        switch(h) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                day = "Error wrong calculation";
        }
        out.println("Day of the week is: " + day);


        /* How it should be done */

        /*
        String expectedPattern = "MM/dd/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
        try
        {
            String userInput = "09/22/2009";
            Date date = formatter.parse(userInput);
            date.applyPattern("EEEE")
            String dayOfWeek = newDateFormat.format(date);

            System.out.println(dayOfWeek);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        */
    }
}
