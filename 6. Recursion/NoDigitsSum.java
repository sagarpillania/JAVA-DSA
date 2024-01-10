import java.util.Scanner;

public class NoDigitsSum {

    static int getSum(int n){
        if(n==0)
            return 0;
        else
            return getSum(n/10) + n%10;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        System.out.println(getSum(n));
        sc.close();   
    }
    
}
