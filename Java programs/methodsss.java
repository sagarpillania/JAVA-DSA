public class methodsss 
{
    public static void main(String[] args)
    {
        // method_nr(); //calling of non-return type method normally
        System.out.println("hi i'm normally printed");
        // methodss.method_nr(); // calling of n-r method using class 
 //---------------------------------return type----------------------------------------------------------------------------
        // System.out.println(getReturnType());
        // getReturnType(); // it won't print because either we have to store it (like down) or print direct (like up)
        // int i =getReturnType();
        // System.out.println(i);
//--------------------return type with parameters--------------------------------------------------------------------------
        // sum(3,4); //again won't print anything
        // System.out.println(sum(3,4)); 
        // System.out.println(sum(3.01f,4.02f)); 
//-------------------------non return with parameter----------------------------------------------------------------------
        // sum1(3,4  ); // for num return type it'll call directly
//--------------------------recursion--------------------------------------------------------------------
        recursion(5);

    }

// ------------NON- RETURN TYPE METHOD -----------------------------
    // static void method_nr()
    // {                   //wrote static to tell that this defined method is a same memory location
    //     System.out.println("i'm non return method");
    // }
//------------------ RETURN TYPE METHOD --------------------------------------------------------------------------
    // static int getReturnType()  //can use Integer(wrapper class) intead of int
    // {
    //     return 12;
    // }
//------------------------return type with parameter----------------------------------------------------------------
        // static Integer sum(int num1 , int num2)
        // {
        //     return num1+num2;
        // }
        // static float sum(float num1 , float num2)
        // {
        //     return num1+num2;
        // }
//------------------------non-return with parameter------------------------------------------------------------------------
        //     static void sum1(int num1 , int num2)
        // {
        //     System.out.println(num1+num2);
        // } 
//---------------------Method overloading------------------------------------------------------------------------------
// increased the input parameters and can change the types of input too. methods can have same name is overloading
        // static void sum1(int num1 , int num2)
        // {
        //     System.out.println(num1+num2);
        // }
        // static void sum1(float num1 , float num2,float num3)
        // {
        //     System.out.println(num1+num2);
        // } 
//----------------------------------RECURSION------------------------------------------------------------------------
        static void recursion(int num){
                System.out.println(num); //in this the num is printed first and then recursion held
                if(num>0)
                   recursion(num-1);
                System.out.println(num); // in this the recursion held first and keep repeating while values stored in the stacka nd then printed from down to top
        }
    
}
