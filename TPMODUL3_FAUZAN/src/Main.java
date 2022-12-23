import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int orderQty, customerID;

            try {
                System.out.print("Customer ID: ");
                customerID = input.nextInt();

                System.out.print("How much food : ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(restaurant);
                Waiters waiters = new Waiters(customerID,orderQty);
                Thread t2 = new Thread(waiters);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("Error, you must input integer");
            }
            input.close();
        }

}