import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");        int a = sc.nextInt();
        int f=1, i=1;
        do{
            f = f*i;
            i++;
        }
        while(i<=a);
        System.out.format("The Factorial of %d Is %d",a,f);
    }
    
}
