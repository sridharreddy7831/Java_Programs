import java.util.*;

public class Bike {
    
    String m, rn, o;   //model = m, registration number = rn, owner  = o
    int p;       // price = p

    void accept()
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter The Bike Model: "); m = ss.nextLine();
        System.out.println("Enter The Owner of the Bike: "); o = ss.nextLine();
        System.out.println("Enter The Registration No.of the Bike: "); rn = ss.nextLine();
        System.out.println("Enter The Price of the Bike: "); p = ss.nextInt();
    }
    void display()
    {
        System.out.println("  ");
        System.out.println(" ");
        System.out.format("Bike Model is %s",m);
        System.out.println(" ");
        System.out.format("Owner of the Bike is %s",o);
        System.out.println(" ");
        System.out.format("Registration Number of Bike is %s",rn);
        System.out.println(" ");
        System.out.format("Price of the Bike Model is %d",p);
        System.out.println(" ");

    }

    public static void main(String[] args) {
        Bike a = new Bike();
        Bike b = new Bike();
        Bike c = new Bike();
        Bike d = new Bike();
        a.accept();
        b.accept();
        c.accept();
        d.accept();
        a.display();
        b.display();
        c.display();
        d.display();


    }
}
