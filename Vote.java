import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int a = sc.nextInt();
        if(a<=18)
        {
            System.out.println("You are Eligible for the Voting");
        }
        else{
            System.out.println("You are not Eligible for the Voting");
        }
    }
}
