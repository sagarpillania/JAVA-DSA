import java.util.Scanner;
public class max_number 
{
    public static void main(String[] args) 
    {
        //without using ternary
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println("greatest is num1 = "+num1);
        else if(num2>num1 && num2>num3)
            System.out.println("num2 is greatest = "+num2);
        else 
            System.out.println("num3 is greatest = "+num3);        
        //with using ternary
        int largest;
        largest=num3>(num1>num2?num1:num2)?num3:((num1>num2)?num1:num2);
        System.out.println("largest number is "+largest);
        scan.close();
    }
}