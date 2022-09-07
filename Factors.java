import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = sc.nextInt();
        int c = 0;
        int i = 1;
        do{
            if(n%i==0)
            {
                System.out.println(i);
                c++;
            }
            i++;
        }
        while(i <=n);
        System.out.format("the Total number of factors is %d",c);
        System.out.println("");

        if(c==2)
        {
            System.out.println("The Given Number is a prime number");
        }
    }
}
