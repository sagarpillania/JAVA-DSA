import java.util.Scanner;
//in tis we have spaces then stars and then again spaces. like 4spaces * 4spaces. then 3 spaces *** 3spaces. for this we run 3 inner loops-space then star then space.
public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
