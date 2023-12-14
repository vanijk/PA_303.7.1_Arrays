import java.util.Arrays;
import java.util.Scanner;

public class PA_Eleven_Console {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int input = scan.nextInt();
        System.out.print("Enter your favorite thing :");
        String[] favorits = new String[input];

        for(int i = 0 ; i < input; i++){
            System.out.print("Enter your favorite thing :");
            favorits[i] = scan.next();
        }

        System.out.print("Your favorite things are :"+ Arrays.toString(favorits));
    }
}
