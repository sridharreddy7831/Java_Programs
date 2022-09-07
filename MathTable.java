import java.util.*;

public class MathTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: "); int n = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.format("%d * %d = %d",n,i,n*i);
            System.out.println(" ");
        }
    }
}
