import java.util.Scanner;

public class AlphaTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char ch=(char) ('E'-i);ch<='E';ch++){
                System.out.print(ch);
                // ch--;
            }
            System.out.println();
        }sc.close();
    }
}
