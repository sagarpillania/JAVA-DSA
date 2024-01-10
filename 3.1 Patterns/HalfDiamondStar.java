import java.util.Scanner;
// for n=3 we have rows=5 i.e 2*n-1 rows alwys. and for star pattern we have 2 conditions simple then i =n and then greater than n we make the stars=2*n-i.
public class HalfDiamondStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
