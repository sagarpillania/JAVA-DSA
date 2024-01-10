import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("print a number to check palindrome: ");
        int x=sc.nextInt();
        int rev=0;
        int temp=x;
        while(temp!=0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        System.out.println(rev==x);
        sc.close();
    }
}
