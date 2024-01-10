import java.util.Scanner;

public class InvertedNumPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
