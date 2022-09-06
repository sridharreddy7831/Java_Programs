import java.util.Scanner;

class Even{
 
     public static void main(String[] args)
   {
      int x;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Number");
      x = sc.nextInt();
      if(x % 400 == 0)
      {
        System.out.println("It Is a Leap year");
      }
      else{
         System.out.println("It is a Not A Leap year");
      }
      }
}