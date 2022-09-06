import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Atm Pin");
        int pin = sc.nextInt();

        if(pin == 1234 || pin == 7831)
        {
            System.out.println("Welcome to user");
        }
        else{

            
            System.out.println("You entered the wrong pin, try again");
        }
    }
}
