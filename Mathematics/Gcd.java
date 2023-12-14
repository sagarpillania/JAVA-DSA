import java.util.Scanner;
// Greatest common divisor or HCF has two solution naive and eucledian algorithm one.
public class Gcd 
{
    public static void main(String[] args)
    {
//----------------------- Naive solution------------------------------------
        Scanner sc=new Scanner(System.in);
        System.out.print("write x: ");
        int x=sc.nextInt();
        System.out.print("write y: ");
        int y=sc.nextInt();
    //     System.out.println(gcd(x, y));
    //     sc.close();
    // }
    // static int gcd(int a,int b){
    //     int res=Math.min(a, b);
    //     while(res>0)
    //     {
    //         if(a%res==0 && b%res==0)
    //         {
    //             break;
    //         }
    //         res--;
    //     }
    //     return res;
//---------------------eucledian algorithm solution-------------------------------------------
        System.out.println("using E.A the gcd is: "+gcd(x, y));
        sc.close();
    }
    static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else 
            return gcd(b, a%b);
    }    
}
