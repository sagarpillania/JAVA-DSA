import java.util.Scanner;
public class RopeCut {

    static int maxPieces(int n,int a,int b, int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res= max(maxPieces(n-a, a, b, c),maxPieces(n-b, a, b, c),maxPieces(n-c, a, b, c));
        if(res == -1){
            return -1;}
        else{
        return res + 1;}
    }

    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b),c);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        System.out.println(maxPieces(n, 2, 2, 2));
        sc.close();   
    }
}
