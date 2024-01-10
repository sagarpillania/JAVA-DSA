// the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.
import java.util.Scanner;
public class SoE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number to find prime number before it: ");
        int x=sc.nextInt();
        // printPrime(x);
        sieve(x);
        sc.close();
    }
//------------------ naive solution----------------------------
    // static void printPrime(int n){
    //     for(int i=2;i<=n;i++)
    //         if(PrimeNumber.isPrime(i)) //that's ho you access method of other class in same folder
    //             System.out.print(i+" ");
    // }
//-----------SOE alorithm approach-------------------------
    public static void sieve(int x) {
        boolean[] sieveArray = new boolean[x + 1];
        for (int i = 2; i <= x; i++) {
            sieveArray[i] = true;
        }
        for (int i = 2; i * i <= x; i++) 
        {
            if (sieveArray[i]) {
                for (int j = i * i; j <= x; j += i) {
                    sieveArray[j] = false;
                }
            }
        }
        for(int i=2;i<=x;i++){
            if(sieveArray[i]){
                System.out.print(i+" ");
            }
        }
    }
}
