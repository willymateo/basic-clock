package antiguo;

import java.util.Calendar;
import java.util.TimeZone;


public class Main
{
    private static Clock clock;
        
    public static void main(String[] args)
    {
        Calendar time = Calendar.getInstance(
            TimeZone.getTimeZone("Europe/Paris")
        );
        
        Clock clock = new Clock();
        clock.setValue(
                time.get(time.HOUR_OF_DAY),
                time.get(time.MINUTE),
                time.get(time.SECOND)
             )
             .setFormat("Current time: %h% %m%'%s%")
             .work();
    }
}