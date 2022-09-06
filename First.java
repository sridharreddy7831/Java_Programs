class First{
  public static void main(String a[]){
    Multiply obj=new Multiply();
    int mul = obj.mul();
    System.out.print(mul);
   }
}

class Multiply{
  int mul(){
    int x = 5;
    int y = 4;
    return x*y;
  }
}