import java.util.Scanner;
// find the missing number in the given range of array.e.g n=3 range =4(n+1). and given array is (1,2,4). so missing number is 3.
public class MissingNumber {
    public static void main(String[] args) 
    {
        // Scanner scan=new Scanner(System.in);
        // System.out.print("enter the size of array; ");
        // int n=scan.nextInt();
        // int arr[]=new int[n];
        // System.out.println("enter the elements of array: ");
        // int lowerrange=1;
        // int upperange=n+1;
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=getUserInputRange(scan,"Element"+(i+1)+": ", lowerrange, upperange);
        // }
        // System.out.print("Array elements are: ");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }
        // int missingNumber=findMissingNumber(arr, lowerrange, upperange);
        // System.out.println("the missing number is: "+missingNumber);
        // scan.close();
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the size of array; ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter th elements of array: ");
// reading the array elements from the user and storing in it
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
// showing the array which we take as input and stored
        System.out.print("Array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scan.close();
        System.out.println("missing number is: " + findNumber(arr, n));
    }
    // static int getUserInputRange(Scanner scanner,String prompt,int lower,int upper){
    //     int UserInput;
    //     do{
    //         System.out.print(prompt);
    //         UserInput=scanner.nextInt();
    //     }
    //     while(UserInput<lower||UserInput>upper);
    //     return UserInput;
    // }
    // static int findMissingNumber(int[] arr,int lowerrange,int upperange){
    //     int xor1=arr[0];
    //     int xor2=lowerrange;
    //     for(int i=1;i<arr.length;i++){
    //         xor1 ^=arr[i];
    //     }
    //     for(int i=lowerrange+1;i<=upperange;i++){
    //         xor2^=i;
    //     }
    //     return xor1^xor2;
    // }
    static int findNumber(int arr[], int n)
    {
        int res1=0;
        int res2=0;
        for(int i=0;i<n;i++){
            res1=res1^arr[i];
        }
        for(int i=1;i<=n + 1;i++){
            res2=res2^i;
        }
        return res1^res2;
    }
}