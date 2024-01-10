import java.util.Scanner;

public class IncLetterTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
// i=2 means 'A'+2= 'A' to 'C'. i.e the loop will run till a to c and then print the characters.
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            
            System.out.println();
        }sc.close();
    }
}
