import java.util.*;

public class SumDigits {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ")
        int r,n, s=0;
        n = sc.nextInt();
        for(;n>0;)
        {
            r = n%10;
            s = s+r;
            n = n/10;
        }
}
