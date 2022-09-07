import java.util.*;

public class Nprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number "); int n = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            int c = 0;
            int j = 1;
            do 
            {
                if(i%j==0)
                {
                    c++;
                }
                j++;
            }
            while(j<=i);

            if(c==2)
            {
                System.out.format("%d ",i);
            }
            i++;
        }
    }
}
