import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int total = 0;
        for (int i=1; i<=numWeeks; i++){
            total += i;
        }
        return total;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i=0; i<menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName +"!");
        System.out.println("There are " + customers.size() + " people in the queue ahead of you.");
        customers.add (userName);
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}


// Ninja Bonus: Implement the printPriceChart method.

// Ninja Bonus: Overload the displayMenu method.

// Sensei Bonus: Implement the addCustomers method.