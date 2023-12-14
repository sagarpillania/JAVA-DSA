/*  this is first java code*/ //every java code has to have atleast one class and one main method containing various statements.
//----------------------------------------------------------------------------------------------------
// public class start
// {  //public=everyone can access, start=class name
// public static void main(String[] args){ //void=return type,there's no return value. main=name of method,strings=argument of method.this method must be given array of strings as an argument and the array will be called args
//     System.out.print("This is my first java program"); //system.out.print=print to standard output, the string we want to print
// }
// }
// public class start{
//     public static void main(String[] args){
//         int num1 =2; //data type then variable name. that's how we declare variable to hold data.
//         int num2 =3;
//         System.out.println("addition of two number is " + (num1 +num2));
//     }
// }
// main method is where execution really starts.--------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------WHILE LOOP------------------------------------------------------------------------------------------------
// public class start
// {
//     public static void main(String[] args)
//     {
//         int x =1;
//         System.out.println("while loop will start after this");
//         while(x<4)
//         {
//         System.out.println("in the loop");
//         System.out.println("values of x is "+ x);
//         x++;
//         } 
//     System.out.println("Loops breaks");
//     }
// }
//--------------------------------------------------TYPECASTING----------------------------------------------------------------------------------------------------------------------
// public class start
// {
//     public static void main(String[] args){
//         //automatic or implicit typecasting- going from lower data space to higher data space
//         // short sh = 12345; //it'll give error as it exceed the data type space. if we use 123456
//         // int IntData = sh;
//         // System.out.print(IntData);
//         // manual or explicit typecasting-
//         int IntVar1= 1234567;
//         short sh1= (short) IntVar1 ;
//         System.out.print(sh1);


//     }
// }
//------------------------------------------------------TAKING INPUT----------------------------------------------------------------------------------------------------------------------------
// import java.util.Scanner;  //imported scanner class package to take input from user

// import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;
// public class start{
//     public static void main(String[] args)
//     throws java.io.IOException
//     {
        // System.out.print("enter the line 1 ; "); //just to make it easy readable and didnt use println so input will be after semicolon
        // Scanner scan_obj = new Scanner(System.in) ; // we made scanner class obj i.e scan_obj and then use the scanner class function system.in to take input
//         //--------using various datatypes----------------
//         // int intData = scan_obj.nextInt(); // then make another variable to use the scanner's object with the method of scanner class for certain datatype.
//         // float floatData = scan_obj.nextFloat(); // it is for taking float as an input.
//         // boolean boolData = scan_obj.nextBoolean(); // it is for taking boolean as an input.
//         // String str = scan_obj.nextLine(); // to write the more than one word we have to use the nextLine. 
//         // String str = scan_obj.next(); // to write a word we have to use the next. It'll take only single word.
//         // char ch = scan_obj.next().charAt(1); // it'll just show an alphabetat index 1.
//         // boolean boolData = scan_obj.nextBoolean(); // then make another variable to use the scanner's object with the method of scanner class for certain datatype.
//         //---------addition of two numbers-----------------------
//         // int num1= scan_obj.nextInt();
//         // System.out.print("enter number 2 : ");
//         // int num2= scan_obj.nextInt();
//         // int sum = num1 + num2;
//         //--------------addition of two lines---------------------
        // String str1= scan_obj.nextLine();
        // System.out.print("enter the line 2 : ");
        // String str2= scan_obj.nextLine();
        // String sum= str1 +" "+ str2;
        // System.out.println("your entered input is :  " + sum ); //just the output.
        //-------------PRINTF-------------------use for multiple arguments--------------------------------------------
        // System.out.printf("%.4f\n",Math.PI); //.4f meaning it'll give pi value upto 4 digits after decimal. 
        // float f1 = 12.34f ;
        // System.out.printf("%.4f\n",f1); // will give value of 4 digits and add two zero after 34
        // System.out.printf("%10.4f\n",f1); // will add space before the output giving the output space of 10.
        // int x = 10;
        // System.out.printf("%d\n" , x); // %d use for printing integer.
        // // System.out.printf("%c" , 'A'); // %c used for character
        // System.out.printf("%c\n" , 65); // ASCII values
        // System.out.printf("%c\n" ,(65+3)); // ASCII values- will print D as 68 value.

//----------------------2ND METHOD OF TKING INPUT--------------------------------------------------
//         char ch;
//         System.out.print("press a character ;-");
//         ch=(char) System.in.read();  // WE have to write throws java.io.IOException to use it. to handle input errors.
//         System.out.println("your entered character is;- "+ch);
//     }
// }
//---------------------------------------------OPERATORS-------------------------------------------------------------------------------------------
// public class start
// {
//         public static void main(String[] args)
//         {
                //-------------------- AIRTHMETIC OPERATORS----------------
                // int num1=5;
                // int num2=4;
                // int num3=7;
                // System.out.println(num1+num2); //output=9
                // System.out.println(num1-num2); //output=1
                // System.out.println(num1*num2);//output=20
                // System.out.println(num1/num2);//output=1 instead 1.something because we have used int. so integer mei answer aaega.
                // System.out.println(num1%num2);//output=1 because it'll give us remainder
                // System.out.println(num2%num1);//output=4 because it'll give us remainder. as 4 not divided by 5 so remainder is 4 as it is.
                //------------------CONDITIONAL OPERATORS------------------
                // System.out.println(2==2); // will give always boolean value i.e output true.
                // System.out.println(2!=2); //false
                // System.out.println(4>=2); //true
                // System.out.println(2<=4);//true
                //--------------------LOGICAL OPERATORS(&&, ||, !)--------------------
                // System.out.println(2>=2 && 4>2); // output=true because && sees both are true. if 2>2 write then it shows false.
                // System.out.println(2>2 || 4>2); // true 
                // System.out.println(2>2 & 4>2);// single & is BITWISE OPERATOR.
                // System.out.println(num1>num2 && num2++>num3);
                // System.out.println(num2); //num2 value will become 5 because of increment
                // System.out.println(num1>num2 & num2++>num3); // here num2 compare as 5>7 which is false.
                // System.out.println(num2); // num2 will become 6
                // System.out.println(num1<num2 && num2++>num3); // here & will check only first statement and give false. because one is false then it is false.
                // System.out.println(num2); //num2 value will not  become 5 because 2nd statement not executed
                // System.out.println(num1<num2 & num2++>num3); // same as above but here 2nd statemen executed
                // System.out.println(num2);  // will give 5.
                // above logic same as with or ||.
                //------------------------SHORT-HAND-OPERATOR------------------
                // int a=3;
                // int b=5;
                // a+=b; // means a=a+b.... same as others = *=,-=,/=,%=..
                // a+=2*b; // only running this gives 13, a=a+2*b
                // a+=3*b; //only running this gives 18.

                // System.out.println(a); // running all three gives 33. as a=8 then 18 and then it becomes 33
//         }
// }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
