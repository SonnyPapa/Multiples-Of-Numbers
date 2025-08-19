import java.util.Scanner;

public class MultiplicationTable {

    static Scanner Console = new Scanner(System.in);

    public void Multiplication() {
        /*
         * This program first prompts a user to enter the first, last and the number of
         * multiples to find multiples of
         */

        // prompts a user to enter first number to find multiple of(eg 2)
        System.out.println("Enter the first number you want to find the multiples of:");
        int first = Console.nextInt();

        // prompts a user to enter last number to find multiple of(eg 6 )
        // meaning the program is going to find multiples of 2 to 6 (2,3,4,5,6)
        System.out.println("Enter the last number you want to find the multiples of:");
        int last = Console.nextInt();

        // prompts a user to enter the number of multiples to find
        System.out.println("How many multiples do you want to find. for eg first 12 or 13(multiples)...?");
        int mult = Console.nextInt();
        for (int i = first; i <= last; i++) {
            System.out.println("First " + mult + " multiples of " + i);
            for (int j = 1; j <= mult; j++) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
            System.out.println();
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.Multiplication();

    }

}
