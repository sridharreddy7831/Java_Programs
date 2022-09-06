import java.util.*;
public class Areac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Of the Circle: ");
        Double r = sc.nextDouble();
        Double a = (3.14)*r*r;
        System.out.format("Area of the Circle is %.2f", a);

    }
}
