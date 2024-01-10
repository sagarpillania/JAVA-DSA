import java.util.Scanner;
// trailing zeroes count in the factorial ex 5!=120 so 1 trailing zeroe, 10! have 2 trailing zeroes. twosolution:-
public class TrailingZeroes {
    public static void main(String[] args) {
// --------------NAIVE SOLUTION as it is not feasile for high input as causes overflowing--------------------------------
        // Scanner sc=new Scanner(System.in);
        // System.out.print("write a number to check it's zeroes: ");
        // int x=sc.nextInt();
        // int fact=1;
        // for(int i=2;i<=x;i++){
        //     fact=fact*i;
        // }
        // System.out.println("factorial of input is: "+fact);
        // sc.close();
        // int res=0;
        // while(fact%10==0)
        // {
        //     res++;
        //     fact=fact/10;
        // }
        // System.out.println("trailing zeroes are : "+res);
//----------------better solution-------------------------
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number to check it's factorial: ");
        int x=sc.nextInt();
        int res=0;
        for(int i=5;i<=x;i=i*5)
        {
            res=res+ x/i;
        }
        System.out.println(res);
        sc.close();
    }
}
