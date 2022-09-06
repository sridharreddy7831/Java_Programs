import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;
public class Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: "); int a = sc.nextInt();
        System.out.println("Enter Second Number: "); int b = sc.nextInt();
        if(a < b)
        {
            System.out.println("Smallest Number is "+ a);
        }
        else{
        System.out.println("Smallest Number is "+b);

        }


    }
    
}
