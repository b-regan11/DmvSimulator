import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Department of Motor Vehicles!");

        Random random = new Random();
        int userNumber = random.nextInt(100) + 1;

        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called.");

        // Call out numbers until the user's number is called last
        System.out.println("Now calling numbers...");

        // Start from the number directly after the user's number
        int currentNumber = (userNumber + 1) % 101;
        
        do {
            System.out.println("Number " + currentNumber + ", please proceed to the counter.");
            currentNumber = (currentNumber + 1) % 101;
        } while (currentNumber != userNumber);

        // Call the user's number last
        System.out.println("Number " + userNumber + ", please proceed to the counter. You're the last one!");
        // Simulate paperwork check with 1% chance of success
        if (random.nextInt(100) + 1 == 1) {
            System.out.println("Congratulations! You have all the required paperwork, and you are all set.");
        } else {
            System.out.println("Maybe you should've brought your paperwork to the DMV you idiot!!!");
        }
    }
}
