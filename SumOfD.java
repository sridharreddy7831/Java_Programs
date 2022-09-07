import java.util.*;
public class SumOfD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = sc.nextInt();
        int r,s=0;
        for(;n>0;)
        {
            r = n%10;
            s = s+r;
            n = n/10;
        }
        System.out.format("The Sum of Individual digits of %d id %d",n,s);
    }
}
