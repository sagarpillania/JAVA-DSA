import java.util.Scanner;
public class Power {
    public static void main(String[] args)     
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a number : ");
        int x=sc.nextInt();
        System.out.print("write a power: ");
        int y=sc.nextInt();
        System.out.println(powr(x, y));
        sc.close();
    }
    // static int powr (int x, int y){
    //     int res=1;
    //     for(int i=1;i<=y;i++){
    //         res=res*x;
    //     }
    //     return res;
    // }
// --------efficent solution----------------
    static int powr (int x, int y){
        if(y==0) return 1;
        int temp=powr(x, y/2);
        temp=temp*temp;
        if(y%2==0)
            return temp;
        else
            return temp*x;
    }
}
