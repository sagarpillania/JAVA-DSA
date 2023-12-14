// kth bit set is nor not means at given value of 'k' the value is '1' or not. 
import java.util.Scanner;
public class KthBit{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("print n: ");
        int n=scan.nextInt();
        System.out.print("print k: ");
        int k=scan.nextInt();
        kthSet(n, k);
        scan.close();
    }
    static void kthSet(int n, int k){
        if((n & (1<<(k-1)))!=0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}