// 'n' people in a circle we have to kill 'kth' position person in every iteration and done in a circular manner until last remain whose index we have to return.
import java.util.Scanner;
public class JosephusProblem {
    static int jos(int n, int k){
        if(n==1)
            return 0;
        else
            return(jos(n-1,k)+k)%n;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print the number of person: ");
        int n=sc.nextInt();
        System.out.print("print the number of positon: ");
        int k=sc.nextInt();
        System.out.println("survived person position is: "+jos(n, k));
        sc.close();
    }
    
}
