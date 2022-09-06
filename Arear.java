import java.util.*;
public class Arear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of the Rectangel: ");
        Double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the Rectangle: ");
        Double b = sc.nextDouble();
        Double a = l*b;
        Double p = 2*(l+b);
        System.out.println("Area of the rectangel is "+p);
        System.out.println("Perimeter of the Rectangel is "+p);

    }
}
