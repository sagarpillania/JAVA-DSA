import java.util.Scanner;

public class SubsetSum {

    static int countSubsets(int []arr, int sum, int i){
        if(sum==0)
        {
            return 1;
        }
        if(sum<0 || i==arr.length)
        {
            return 0;
        } 
        return countSubsets(arr, sum, i+1) + countSubsets(arr, sum-arr[i], i+1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in array: ");  
        int n=scan.nextInt();
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {     
            arr[i]=scan.nextInt();  
        }  
        System.out.print("enter the sum to check how many subsets have same sum: ");
        int sum=scan.nextInt();
        System.out.println("no. of subets who have same sum is "+countSubsets(arr,sum,0));
        scan.close();
    }
}
