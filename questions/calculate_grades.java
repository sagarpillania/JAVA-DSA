import java.util.Scanner;
public class calculate_grades 
{
    public static void main(String[] args)
    {
        Scanner result =new Scanner(System.in);
        System.out.print("enter the marks ;- ");
        int marks=result.nextInt();
        if(marks>=90)
        {
            System.out.println("A grade");
        }
        else if(marks<90 && marks>=80)
        {
            System.out.println("B grade");
        }
        else if(marks<80 && marks>=70)
        {
            System.out.println("C grade");
        }
        else{
            System.out.println("Fail");
        }
            result.close();
        
    }
    
}
