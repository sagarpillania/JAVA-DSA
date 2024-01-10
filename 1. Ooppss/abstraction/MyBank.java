interface MyBank {
    // void abcd{}// error because abstract method will be declare only not specify body. as interface using made it abstract.
    void writeData();
    void readData();
}

// in interface only declares. it is implemented in another class

class SBIread implements MyBank
{
    @Override
    public void readData(){
        System.out.println("inside interface read");
    }
    @Override
    public void writeData(){
        System.out.println("interface writedata");
    }
    
}