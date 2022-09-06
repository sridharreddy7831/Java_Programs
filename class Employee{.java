class Employee{
    String e_name;
    int e_salary;
    String e_designation;
    void ename(){
        System.out.println("My name is "+this.e_name);
    }
    void esal(){
        System.out.println("My Salary is "+this.e_salary);
    }
    void desig(){
        System.out.println("Designation: "+this.e_designation);
    }
    Employee(String name, int salary, String designation){
        this.e_name=name;
        this.e_salary=salary;
        this.e_designation=designation;
    }
}
class Sample{
    public static void main(String args[])
    {
        Employee obj1=new Employee("Vishnu",999999,"HR");
        Employee obj2=new Employee("Kalyan",989898,"HR ki minchi");
        obj1.ename();
        obj1.esal();
        obj1.desig();
        obj2.ename();
        obj2.esal();
        obj2.desig();
        
    }
}
