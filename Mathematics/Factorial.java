import java.util.Scanner;
//----------------------------- iterative implemenataion-------------------
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number to check it's factorial: ");
        int x=sc.nextInt();
        int res=1;
        for(int i=2;i<=x;i++){
            res=res*i;
        }
        System.out.println(res);
        sc.close();
    }   
// ---------------------------RECURSIVE solution---------------------------------------
    // public static void main(String[] args) 
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("write a number to check it's factorial: ");
    //     int x=sc.nextInt();
    //     // long answer=fact(x);
    //     System.out.println("factorial of the given input is "+fact(x));
    //     sc.close();
    // }
    // static int fact(int n)
    // {
    //     if(n==0||n==1)
    //          return 1;
    //     return n*fact(n-1);
    // }       
}


