import java.util.Scanner;
// here we have to print the right angled pyramid using number as the rows increases.
public class NumberPyramid {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
