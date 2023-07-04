import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a ticket price");
        int ticketPrice = in.nextInt();
        System.out.println("Your bonus is: " + ticketPrice / 20 + " mile(s)");
    }
}
