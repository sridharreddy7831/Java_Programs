import java.util.*;
public class Abs {
    
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        if(n < 0)
        {
            n = -n;
        }
        System.out.println("the absoulte value of the given number is "+n);
    }
}
