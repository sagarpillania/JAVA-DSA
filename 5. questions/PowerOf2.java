import java.util.Scanner;
// check a number is a power of 2 or not.
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Print number: ");
        int n=sc.nextInt();
        System.out.println(Po2(n));
        sc.close();
    }
    // static boolean Po2(int n){
    //     if(n==0)
    //         return false;   
    //     while(n!=1){
    //         if(n%2!=0)
    //             return false;
    //         n=n/2;
    //     }
    //     return true;
    // }
// -----------expert and one line solution using and operator-----------------
        static boolean Po2(int n){
        if(n==0)
            return false;   
        while(n!=1){
            return((n&(n-1))==0);
        }
        return true;
    }
}
