import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
// this is a code to count number of digits in a given number.
        Scanner sc= new Scanner(System.in);
        System.out.print("print value of x: ");
        int x=sc.nextInt();
        int count=0;
        while(x>0)
        {
            x=x/10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}
