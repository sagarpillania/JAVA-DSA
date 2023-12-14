import java.util.Scanner;
public class odd_number 
{
   public odd_number() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("enter your number :- ");
      int var2 = var1.nextInt();
      if (var2 % 2 != 0) {
         System.out.println("input number is odd");
      } else {
         System.out.println("input number is even");
      }

      var1.close();
   }
}

