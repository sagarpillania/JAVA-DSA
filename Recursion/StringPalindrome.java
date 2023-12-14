import java.util.Scanner;

public class StringPalindrome {

    static boolean isPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        return(str.charAt(start)==str.charAt(end))&&isPalindrome(str, start +1, end -1);

    }
    public static void main(String[] args) {
        int start=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("print the input: ");
        String str=sc.next();
        int end=str.length()-1;
        System.out.println(isPalindrome(str, start, end));
        sc.close();
    }
}
