// find the odd occurring number in the given set of arryay. e.g-{1,1,2,2,2,3,3} so odd occuring ia 2.
import java.util.Scanner;
public class OddOccurring {
    public static void main(String[] args) 
    {
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
// -------------naive solution of O(n^2) time complexity-----------
        // for(int i=0;i<n;i++)
        // {
        //     int count=0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[j]==arr[i])
        //             count++;
        //     }
        //     if(count%2!=0)
        //         System.out.println("odd occurring number is; "+arr[i]);
        // }
// ----------- O(n) time complexity solution usinf xor operator----------------------
        int res=0;
        for(int i=0;i<n;i++){
            res=res^arr[i];
        }
        System.out.println("odd occurring number is; "+res);
        scan.close();
    }
}
