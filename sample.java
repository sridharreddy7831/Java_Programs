import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        x = sc.nextInt();
  
            System.out.println("table Of "+ x +" is:");
            
            for(int i=1;i<11;i++)
            {
                System.out.println(x+"x"+ i +"="+x*i);
            }
        }
    }