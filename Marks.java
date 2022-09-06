import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Student Name :");
        String name = sc.nextLine();
        System.out.println("Enter The Roll number Of the Student :");
        int num = sc.nextInt();
        System.out.println("Enter Subject Marks:");
        System.out.print("Subject 1: "); int a = sc.nextInt();        
        System.out.print("Subject 2: "); int b = sc.nextInt();        
        System.out.print("Subject 3: "); int c = sc.nextInt();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("");
        System.out.println("**********Student Details**********");
        System.out.println("Name Of the Student --> "+name);
        System.out.println("Roll Number Of the Student --> "+num);
        System.out.println("Marks Obtained By the "+name+" :");
        System.out.println("Subject 1 = "+a);
        System.out.println("Subject 2 = "+b);
        System.out.println("Subject 3 = "+c);
        System.out.println("Total Obtained by The "+name+" is : "+sum);
        System.out.println("Average Obtained by The "+name+" is : "+avg);
        


    }
}
