import java.util.Scanner;

public class StringPermutation {

    static void permuation(char [] arr, int fi){
        if(fi==arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i=fi; i<arr.length;i++){
            swap(arr,i,fi);
            permuation(arr, fi+1);
            swap(arr,i,fi);
        }
    }
    static void swap(char[] arr,int i,int fi){
        char temp=arr[i];
        arr[i]=arr[fi];
        arr[fi]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print the string to find its permuatation: ");
        String s= sc.next();
        int fi=0;
        permuation(s.toCharArray(), 0);
        sc.close();
    }
    
}
