class Student{
    void show(){
    System.out.println("I am a student of KSRM....");
}
}
class Hemanth extends Student(){

}
class Test{
    public static void main(String args[]){
        Hemanth obj=new Hemanth();
        obj.show();
    }
}