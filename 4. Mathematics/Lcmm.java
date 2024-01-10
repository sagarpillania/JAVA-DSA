import java.util.Scanner;
public class Lcmm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write x: ");
        int x=sc.nextInt();
        System.out.print("write y: ");
        int y=sc.nextInt();
        System.out.println("lcm is: "+lcm(x, y));
        sc.close();
    }
//------------NAIVE SOLUTION-------------------------------------------------
    // static int lcm(int a,int b){
    //     int res=Math.max(a, b);
    //     while (true) {
    //         if(res%a==0 && res%b==0)
    //             return res;
    //         res++;
    //     }
    // }
//------------------EFFICENT SOLUTION using gcd/hcf-------------
        static int gcd(int a, int b){
            if(b==0)
                return a;
            return gcd(b,a%b);
        }
        static int lcm(int a, int b){
            return (a*b)/gcd(a, b);
        }
}
