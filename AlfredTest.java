public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Merryweather Vane");
        String testGuestGreetingNinja = alfredBot.guestGreeting("Merryweather Vane", "Morning");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String testDateLunarNewYear = alfredBot.dateLunarNewYear();
        String alexisTest = alfredBot.answeringBeforeAlexis(
                            "Alexis! Unlock the batmobile!"
                            );
        String alfredTest = alfredBot.answeringBeforeAlexis(
            "Alfred, have you seen the batmobile keys?");
        String notRelevantTest = alfredBot.answeringBeforeAlexis(
            "Hah! They were in my batsuit all along!"
        );
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreetingNinja);
        System.out.println(testDateAnnouncement);
        System.out.println(testDateLunarNewYear);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}

