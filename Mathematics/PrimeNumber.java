import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number to check prime or not: ");
        int x=sc.nextInt();
        System.out.println("number is prime: "+isPrime(x));
        sc.close();
    }
// ---------------------NAIVE SOLUTION--------------------------------------
    // static boolean isPrime(int x){
    //     if(x==0||x==1)
    //         return false;
    //     for(int i=2;i<x;i++)
    //         if(x%i==0)
    //             return false;
    //     return true;
    // }
// -------------------EFFICENT SOLUTION by doing i*i we save the iterations-----------------------------
        // static boolean isPrime(int x){
        //     if(x==0||x==1)
        //         return false;
        //     for(int i=2;i*i<=x;i++)
        //         if(x%i==0)
        //             return false;
        //     return true;
        // }
// further optimize solution is adding check for even number i.e divide by 2 and divide by 3--------------------
        static boolean isPrime(int x){
            if(x==2||x==3) return true;
            if(x==0||x==1||x%2==0||x%3==0)
                return false;
            for(int i=5;i*i<=x;i=i+6)
                if(x%i==0||x%(i+2)==0)
                    return false;
            return true;
        }
}
