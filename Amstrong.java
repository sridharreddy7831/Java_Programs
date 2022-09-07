import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        
        int t=n;
        int r,s=0;
        while(n>0)
        {
            r = n%10;
            s=s+r*r*r;
            n = n/10;
        }
        if(t==s){
                System.out.println("It is an amstrong number");
        }
        else{
            System.out.println("It is not an amstrong number");
        }
    }
}
