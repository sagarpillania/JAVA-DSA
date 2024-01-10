// we have to pint all the divisor of a number n in an increasing order.
import java.util.Scanner;
public class NumberDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number to find its divisor: ");
        int n=sc.nextInt();
        printDivisor(n);
        sc.close();
    }
// ----------naive solution with T.C= O(n)-----------------------
    // static void printDivisor(int n){
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0)
    //             System.out.println(i);
    //     }
    // }
//-------------better solution with T.C=O(root n)--------------------
    static void printDivisor(int n){
        int i;
        for(i=1;i*i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        for( ;i>=1;i--)
        {
            if(n%i==0)
                System.out.print(n/i+" ");
        }
    }
}
