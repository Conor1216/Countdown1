import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Enter time in seconds.");
        int userInput = numberScanner.nextInt();
        int seconds = userInput;

        while (seconds > -1) {
            try {
                Thread.sleep(1000);
                seconds = (seconds - 1);
            } catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(seconds + " seconds left.");
            if (seconds < 0) {
                System.out.println("Time's up!");
            }
        }
    }
}
