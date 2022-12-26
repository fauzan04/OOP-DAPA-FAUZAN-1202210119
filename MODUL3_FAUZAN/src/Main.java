import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static boolean repeat = true;
    private static boolean report = false;
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();
        
        do{
            try{
                System.out.print("Menu Program\n");
                System.out.print("1. Square\n");
                System.out.println("2. Circle\n");
                System.out.println("3. Trapezoid\n");
                System.out.print("Select Menu: ");
                int select = input.nextInt();

                switch(select){
                    case 1:
                    System.out.print("Enter the length of the side of the square : ");
                    calculation.setSide(input.nextDouble());
                }
            }
        }

    
}
