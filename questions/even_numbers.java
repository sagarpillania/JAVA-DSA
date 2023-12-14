import java.util.Scanner;
public class even_numbers
{
    public static void main(String[] args) 
    {
        // even number
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("number is even and number is = "+num);
        }
        else
            System.out.println("number is odd and number is = "+num);
        scan.close();
    }
    
}
