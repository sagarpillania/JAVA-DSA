public class swap_numbers 
{
    public static void main(String[] args) 
    {
        // with using temporary
        int num1=5;
        int num2=4;
        System.out.println("before swapping, num1 = "+num1+" and num2 = "+num2);
        int temp =num2;
        num2=num1;
        num1=temp;
        System.out.println("After swapping, num1 = "+num1+" and num2 = "+num2);
        // without using temporary
        int i=5;
        int j=3;
        System.out.println("before swapping, i = "+i+" and j = "+j);
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("After swapping, i = "+i+" and j = "+j);        
    }
    
}
