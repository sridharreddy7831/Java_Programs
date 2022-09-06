import java.util.Scanner;
public class Studmarks {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the six subject marks");
 
        int s1 = sc.nextInt();
 
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        int s6 = sc.nextInt();
       
        double total = s1 + s2 + s3 + s4 + s5 +s6;
        double  avg = total/6;
 
        if(s1 >= 50 && s2 >=50 && s3 >= 50 && s4 >= 50 && s5 >= 50 && s6 >= 50)
        {
            System.out.println("Pass");
            if(avg >=60)
            {
                System.out.println("Grade: A");
            }
            else
            {
                System.out.println("Grade: B");
            }
        }
        else
        {
            System.out.println("Fail");
            System.out.println("No grade");
        }
    }
 
}
