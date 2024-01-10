import java.util.Scanner;

public class SymmetricVoid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        // int spaces=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pattern
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<2*((n-i)-1);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
