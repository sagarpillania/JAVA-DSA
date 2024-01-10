//abstraction=is implementation hiding i.e only make them see essenatial details. can be achieved through interface(100%) and abstrac keyword. 
//we can't make objects of abstract classes. we can't write anything inside the body of abstract method

public abstract class Bank {
    String name;
    // abstract void readData(){ " " } // will give error because abstract methods can only be declare
    abstract void readData();
    abstract void writeData();
    // void sagar(){ // w/o abstract keyword we can make simply the method in abstract class but not in the interface.

    // }
}
//we have to make new class to use the abstract method declared above. abstract keyword uses extends keyword.
class Admin extends Bank{
    void readData(){

    }
    void writeData(){

    }
}
//we make another class and if we use the same method then data ill be override.
class Marketting extends Bank{
    @Override
    void readData(){

    }
    @Override
    void writeData(){

    }
} 
