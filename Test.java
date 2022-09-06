class Student
{
    void Show()
    {
        System.out.println("My Name Is Vishnu Teja Reddy");
    }
    Student()
    {   System.out.println("Constrouctor is created sucessfully");
    }
}

class Test
{
    public static void main(String arg[])
    {
        Student obj=new Student();
        obj.show();
    }
}