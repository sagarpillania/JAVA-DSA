//encap=wrapping of data in a single unit and to secure it we put private before every data and then use getter and setter.
class Employee{
    private int empId=2;
    private int basicSal=20000;
    private int incentive=2000;
    private int ph=9898;
    private String name="Sagar";
    void countSal(){   //made method
        System.out.println(basicSal+incentive);
    }
    Employee(){
        ph=4444;
        name="vikrant";
    }
//-------------------- getter method making--------------------------
    int getPh(){
        return ph;
    }
    String getName(){
        return name;
    }
// -----------------using constructor--------------------
    Employee(int phoneNum,String Name){
        ph=phoneNum;
        name=Name;
    }
//----------------setter(to update or change)--------------------------
        void setPh(int phone)
        {
            ph=phone;
        }
        void setName(String name)
        {
            this.name=name;
        }  
}
public class Test {
    public static void main(String[] args) 
    {
        // Employee engineer=new Employee();//made object of class employee with it's constructor 'Employee()'
        // engineer.countSal();
        Employee engineer2=new Employee();
        Employee engineer=new Employee(9896,"SHIVAM"); //output is 9896 and shivam. using constructor with parameters.
        // System.out.println(engineer.empId); //access the data members of class like this
        // engineer.countSal();//can call method like this
        // System.out.println(Employee.empId); // will show error because we haven't made the class static. ecause our main is static
//-----------------------getter(to get info)---------------------------------------
        // System.out.println(engineer.getPh()); //output=9898 & afterconstructor with parameter=9896
        // System.out.println(engineer.getName());//out=Sagar & afterconstructor with parameter=shivam
//----------------------setter--------------------------
        engineer2.setName("Vikram");
        engineer2.setPh(9999);
        System.out.println(engineer2.getPh());
        System.out.println(engineer2.getName());
    }
    
}
// thus encapsulation is wrapping up the data into single unit with keeping up the security measures intact.