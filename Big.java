import java.util.*;
public class Big {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b)
        {
            System.out.println("biggest Number is "+b);
        }
        else{
            System.out.println("Biggest number is "+a);

        }
        
    }
}
