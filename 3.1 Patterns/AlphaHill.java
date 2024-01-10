import java.util.Scanner;

public class AlphaHill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char ch='A';
            int breakpoint=(2*i+1)/2;
        // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //char
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }sc.close();
    }
}
