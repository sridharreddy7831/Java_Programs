/*wap to calculate the electricity bill
	@ accept the last month readings
	@ accept the present month readings
	@ calculate the total number of units  (present - last)
	@ if the units is <=50 	    	    ----> 2 Rs
			  <=100             ----> 3 Rs
			  >=101 and <=200   ----> 4 Rs
 			  >=201 and <=500   ----> 5 Rs
              
*/


import java.util.*;
public class Currentbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last Month Reading:"); int last = sc.nextInt();
    
        System.out.println("Enter the Present Month Reading:"); int present = sc.nextInt();
        int x = present-last;
        if(x<=50)
        {
            System.out.format("The Electricity bill is %d",2*x);
        } 
        else if(x>50 &&  x<=100)
        {
            System.out.format("The Electricity Bill is %d",3*x);
        }
        else if(x>101 &&  x<=200)
        {
            System.out.format("The Electricity Bill is %d",4*x);
        }
        else if(x>201 &&  x<=500)
        {
            System.out.format("The Electricity Bill is %d",5*x);
        }
    }
}
