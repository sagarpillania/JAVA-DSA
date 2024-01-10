import java.util.Scanner;
// it's also a program of reverse counting N to 1..
public class FunctionWorking {
//------------simple working of function-----------------------
    //     static void fun1(){
    //         System.out.println("fun 1");
    //     }
    //     static void fun2(){
    //         System.out.println("before fun 1");
    //         fun1();
    //         System.out.println("after fun 1");
    //     }
    // public static void main(String[] args) {
    //     System.out.println("before fun 2");
    //     fun2();
    //     System.out.println("after fun2 ");
    // }
//------------working of recursive function--------------------
        static void fun1(int n){
            // if(n<0){ it'll give 0 too after 1 whereas below cpde stops at 1.
            if(n==0){
                return;
            }
            else{
                System.out.println("reverse counting: "+n);
                fun1(n-1);
            }
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("print the input: ");
            int n = sc.nextInt();
            fun1(n);
            sc.close();
        }
}