import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angleInput = scanner.nextInt();

        /*
         *  your code goes here
         */

         int angleH = 2*(angleInput%30);
         System.out.print(angleH);

        // closing the scanner object
        scanner.close();
    }
}