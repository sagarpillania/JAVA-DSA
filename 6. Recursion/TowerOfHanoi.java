import java.util.Scanner;

public class TowerOfHanoi {
    static void toh(int n,char A,char B,char C){
        if(n==1){
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }
        toh(n-1, A, C, B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        toh(n-1, B, A, C);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print the disc number: ");
        int n=sc.nextInt();
        toh(n,'A','B','C');
        sc.close();
    }
}
