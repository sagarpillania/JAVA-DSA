// write a program to count number in reverse and then continue normally after 1.

import java.util.Scanner;

public class CountNdReverse {
    static void fun1(int n){
//--------reverse and count number straight-------------------
        if(n==0)
            return;
        // System.out.println(n); // if we comment it out then it'll write number from 1 to N. otherwise write N to 1. 
        fun1(n-1);
        System.out.println(n);
//--------------code another---------------------------------
        // if(n==0)
        //     return;
        // fun1(n-1);
        // System.out.println(n);
        // fun1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give input number: ");
        int n = sc.nextInt();
        fun1(n);
        sc.close();
    }
}
