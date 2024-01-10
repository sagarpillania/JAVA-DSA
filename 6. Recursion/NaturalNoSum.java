import java.util.Scanner;

public class NaturalNoSum {
    static int sum(int n){
        if(n==0){
            return 0;}
        else{
            return n + sum(n-1);}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter te number till find sum: ");
        int n= sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
