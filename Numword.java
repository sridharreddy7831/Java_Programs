//wap to accept any number from 1 to 5 and display the word in english letter (ex:- 1 == ONE) 


import java.util.*;
public class Numword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int a = sc.nextInt();
        switch(a){
            case 1:
            System.out.println("One");
            break;
            case 2:
            System.out.println("Two");
            break;
            case 3:
            System.out.println("Three");
            break;
            case 4:
            System.out.println("Four");
            break;
            case 5:
            System.out.println("Five");
            break;
            default:
            System.out.println("Wrong Choice, Enter number between 1 to 5");
            
        }
    }
}
