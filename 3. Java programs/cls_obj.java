// class Person
// { 
//     // we have declared instances variables(data,states) of the class. a class can contain data and subroutines(methods)..
//     String name; //instance variables
//     int age;
//     int UID;
// }

// public class cls_obj
//  {
//     public static void main(String[] args) 
//     {
//         Person person1=new Person(); //we make the object of that class i.e person1 for the reference fo the class
//         person1.name="sagar"; //we added value to the reference of the class.
//         person1.age=25;
//         person1.UID=20982;
//         System.out.println(person1.UID);
           
//     }       
// }
//----------------------------------------------------------------METHODS OF CLASS-------------------------------------------------------------------------------------------------
// class Vehicle
// {
//     int fuel_capacity;
//     int passenger_capacity;
//     float kmpl; //km per litre

//     void range() //range method combined with the vehicle class.
//     {
//         System.out.println("Range is "+fuel_capacity*kmpl); // we use the instance variables w/o obj because to make a general method to use by any obj.
//     }



// }
// public class cls_obj{
//     public static void main(String[] args)
//     {
//         Vehicle maruti=new Vehicle();
//         maruti.passenger_capacity=5;
//         maruti.fuel_capacity=30; //assign values to the maruti
//         maruti.kmpl=25;

//         Vehicle creta=new Vehicle(); //2nd object of class vehicle
//         creta.passenger_capacity=5;
//         creta.fuel_capacity=35;
//         creta.kmpl=15;

//         System.out.print("Maruti have the capacity of "+maruti.passenger_capacity+".");
//         maruti.range(); //here range is called and it uses the variables of the maruti and did the computation and display the values

//         System.out.print("Creta have the capacity of "+creta.passenger_capacity+".");
//         creta.range();

        
//     }

// }
//---------------------------------------------------------ARGUMENTS PASSING IN IT-----------------------------------------------------------------------------------
// class CheckNum{
//     boolean isEven(int x){  //when we provide any return value instead of void then use return instead of out.println
//         if((x%2)==0) return true;
//         else return false;
//     }
// }

// public class cls_obj 
// {
//     public static void main(String[] args) 
//     {
//         CheckNum num=new CheckNum();
//         if(num.isEven(10)) System.out.println("10 is even");
//         if(num.isEven(9)) System.out.println("9 is even");
//         if(num.isEven(12)) System.out.println("12 is even");
        
//     }
// }
//--------------------------------------------------CONSTRUCTOR-------------------------------------------------------------------------
// class Vehicle
// {
//     int fuel_capacity;
//     int passenger_capacity;
//     int kmpl; //km per litre

//     Vehicle(int p,int f,int m){
//         fuel_capacity=p;
//         passenger_capacity=f;
//         kmpl=m;
//     }
//     int range() //range method made to combined with the vehicle class. with int return type that's why we used return instead of out.println
//     {
//         return fuel_capacity*kmpl; 
//     }
//     double fuelNeeded(int miles){ //made another method to count fuel needed to drive certain distance
//         return miles/kmpl;
//     }
// }

// public class cls_obj{
//     public static void main(String[] args)
//     {
//         Vehicle maruti=new Vehicle(30,5,25); // vehicle on right hand side one is constructor. and we passed the arguments for the particular obj as soon as it is made.

//         Vehicle creta=new Vehicle(35,5,15); // we use the constructor to pass the argument for the certain object and amde the code concise.
//         double galloons;
//         int dist=350;
//         galloons=maruti.fuelNeeded(dist);
//         System.out.print("Maruti have the capacity of "+maruti.passenger_capacity+" & runs "+maruti.range()+" & for 252 distance it requires "+galloons+" litres. \n");
//         galloons=creta.fuelNeeded(dist);
//         System.out.print("Creta have the capacity of "+creta.passenger_capacity+" & runs "+creta.range()+" & for 252 distance it requires "+galloons+" litres.");

        
//     }

// }
//---------------------------------