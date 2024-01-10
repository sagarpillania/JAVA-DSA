import java.util.Scanner;

public class Rectangular{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print the input to make the rectangular pattern :");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++) // it'll run for n+1 times rows
        {
            for(int j=0;j<n;j++){ // used to make columns
                System.out.print("* "); // it'll print it in single line 
            }
            System.out.println(); // used to print the line after execution for each i value.
        }
        sc.close();
    }
}