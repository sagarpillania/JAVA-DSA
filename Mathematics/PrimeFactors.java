import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number to check it's prime factors: ");
        int x=sc.nextInt();
        primeFactors(x);
        sc.close();
    }
//=-------to check the prime factors of a number, it require isprime function--------------------
    // static void primeFactors(int x)
    // {
    //     for(int i=2;i<x;i++)
    //     {
    //         if(PrimeNumber.isPrime(i))
    //         {
    //             int n=i;
    //             while (x%n==0) 
    //             {
    //                 System.out.print(i+" ");
    //                 n=n*i;
    //             }
    //         }    
    //     }
    // }
//--------------------efficent solution-forthis we don't require the isprime function-----------------------------
    static void primeFactors(int x)
    {
        if(x==1) return;
        for(int i=2;i*i<=x;i++)
        {
            while(x%i==0)
            {
                System.out.println(i);
                x=x/i;
            }
        }
        if(x>1)
            System.out.println(x);
    }
}
