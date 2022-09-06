import java.util.*;
public class Numrange {
    public static void main(String[] args) {
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();

        if(num>=1 && num <=10)
        {
            System.out.println("The Given Number Is in the range between 1 to 10");
        }
        else if(num>=11 && num <=20)
        {
            System.out.println("The Given Number Is in the range of 11 to 20");
        }
        else if(num>=21 && num <=30)
        {
            System.out.println("The Given Number Is in the range of 21 to 30");
        }
        else if(num>=31 && num <=40)
        {
            System.out.println("The Given Number Is in the range of 31 to 40");
        }
        else
        {
            System.out.println("the Number is greater than 40");
        }
        }
    }
}
