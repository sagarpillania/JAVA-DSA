import java.util.Scanner;
public class switch_calculator 
{
    public static void main(String[] args)
    {  
        Scanner calcu=new Scanner(System.in);
        System.out.print("enter your num1 :-");
        int num1=calcu.nextInt();
        System.out.print("enter your num2 :-");
        int num2=calcu.nextInt();
        System.out.println(" choose your option :- +,-,*,/,%");
        char ch=calcu.next().charAt(0);
        switch(ch)
        {
            case '+':System.out.println("addition = " +(num1+num2));
            break;
            case '-': System.out.println("subtraction = "+(num2-num1));
            break;
            case '*': System.out.println("multipilcation  = "+(num2*num1));
            break;
            case '/': System.out.println("division = "+(num1/num2));
            break;
            case '%': System.out.println("modulus/remainder = "+(num1%num2));
            break;
            default: System.out.println("you entered wrong option");
            break;
        }
        calcu.close();

    }
}
