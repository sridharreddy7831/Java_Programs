import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: "); int x = sc.nextInt();
        int a = 1;
        int s = 0;
        while(a<=x)
        {
            s +=a;
            a++;
        }
        System.out.format("Sum of 1 to %d Natural numbers is %d",x,s);
    }
}
