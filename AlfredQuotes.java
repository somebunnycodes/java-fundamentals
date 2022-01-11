import java.util.Calendar;
import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Salutations, friend. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format ("Hello, " + name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format ("Hello, " + name + ". Lovely to see you this" + dayPeriod);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format ("It is currently " + new Date());
    }

    public String dateLunarNewYear() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        //appartently java starts months from 0 so yeah... not confusting AT ALL//
        if (month == 1 && day == 1) {
            return "Happy Lunar New Year! It is now the year of the tiger!";
        }
        else {
            return "Lovely weather we're having";
        }
    }
    
    public String answeringBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "What shall I do? Alexis is useless...";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "You summoned me?";
        }

        return "I'll wait here until needed...";

    }

}