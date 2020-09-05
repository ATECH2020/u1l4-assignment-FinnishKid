import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt(); 

        /*
         *  your code goes here
         */
        int group1desk = group1/2 + group1%2;
        int group2desk = group2/2 + group2%2;
        int group3desk = group3/2 + group3%2;

        int totaldesk = group1desk + group2desk + group3desk;
        System.out.print(totaldesk);

        // closing the scanner object
        scanner.close();
    }
}