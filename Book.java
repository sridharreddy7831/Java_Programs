import java.util.*;

public class Book {
  
    
    String n,a;   //name = n, author = a
    int p,y;        // price  = p, year = y

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Book Name : "); n = sc.nextLine();
        System.out.println("Enter The Book Author : "); a = sc.nextLine();
        System.out.println("Enter The Book Price : "); p = sc.nextInt();
        System.out.println("Enter The Published year : "); y = sc.nextInt();
    }
    void display()
    {
        System.out.println(" ");
        System.out.format("Name Of the book is %s",n);
        System.out.println(" ");
        System.out.format("Author Of the book was %s",a);
        System.out.println(" ");
        System.out.format("Manufacturing Year Of the book is %d",y);
        System.out.println(" ");
        System.out.format("Price Of the book is %s",p);
        System.out.println(" ");

    }

    public static void main(String[] args) {
        Book b = new Book();
        Book b1 = new Book();
        Book b2 = new Book();
        b.accept();
        b1.accept();
        b2.accept();
        b.display();
        b1.display();
        b2.display();
    }
}
