import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fname = sc.next();

        System.out.println("Enter the last name: ");
        String lname = sc.next();
        System.out.println(fname+" "+lname);
    }
}

