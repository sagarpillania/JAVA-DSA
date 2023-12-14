//plymorphism is of two types method overloading(compile time & static type) and method overriding(runtime & dynmaic type).
//overloading happens in same class by change return type,change type of parameters, change in no. of parameter.
//-----------overloading--------------------
class Features{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Features ft=new Features();
        ft.add(2,3);
        ft.add(3.2,2.4);
    }
}

