import java.util.Scanner;

public class BinaryNumRtTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int stars=1;
        for(int i=0;i<n;i++){
            if(i%2==0) stars=1;
            else stars=0;
            for(int j=0;j<=i;j++){
                System.out.print(stars+" ");
                stars=1-stars;
            }
            System.out.println();
        }
        sc.close();
    }
}
