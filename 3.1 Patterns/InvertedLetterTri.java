import java.util.Scanner;

public class InvertedLetterTri {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
// i=2. 'A'+(5-2-1)='A' +2 ='A' to 'C'
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }   
            System.out.println();
        }sc.close();
    }
}
