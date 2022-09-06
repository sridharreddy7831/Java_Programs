import java.util.Scanner;
 
class Big3
{
     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter any three numbers");
 
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b)
        {
            if(a > c)
            {
                System.out.println(a+ " is biggest");
            }
            else
            {
                System.out.println(c+" is biggest");
            }
 
        }
        else
        {
            if(b > c)
            {
                System.out.println(b+" is biggest");
            }
            else
            {
                System.out.println(c+" is biggest");
            }
        }
 
     }
}
