import java.util.Scanner;

//here we need stars according to i value. i=3 then we need three stars in third row. number of row=number of stars.

public class RightAngledTriangle {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("print the input to make the Right Anfled Triangle pattern :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
