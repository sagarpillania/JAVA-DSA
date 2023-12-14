// count set means counting the number of'1' in the bit representation of a number.
import java.util.Scanner;
public class CountSet {
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("print n: ");
        int n=scan.nextInt();
        System.out.println(Cset(n));
        scan.close();
    }
// naive solution---------------------
    // static int Cset(int n){
    //     int res=0;
    //     while (n>0) 
    //     {
    //     if((n&1)==1)  //or use if(n%2!=0)to see the last element is 1
    //         res++;
    //     n=n>>1;  //or use n=n/2; to remove the last element of the bit
    //     }
    //     return res;
    // }
//------- BRIAN KERNINGAM'S ALGO--------------------------
    static int Cset(int n){
        int res=0;
        while(n>0){
            n=n&(n-1);
            res++;}
        return res;
    }

}
