import java.util.Scanner;

public class FindingMultiplesButThisTimeTakingUserInput {
        static Scanner irr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the total number of numbers you want to find multiples of:");
        int up = irr.nextInt();
        System.out.println("Enter the first number you want to find the multiples of:");
        int first = irr.nextInt();
        System.out.println("Enter the last number you want to find the multiples of:");
        int last= irr.nextInt();
        System.out.println("How many multiples do you want to find. for eg first 12 or 13(multiples)...?");
        int okk = irr.nextInt();
        for(int i=first; i<=last; i++){
            System.out.println("First "+okk+" multiples of "+first);
            for(int j=1; j<=okk; j++ ){
                System.out.println(i+"*"+ j+ " = "+ i*j);
            }
            first++;
            System.out.println();
            System.out.println();
        }

        
    }

}
