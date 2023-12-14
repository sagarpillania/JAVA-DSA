import java.util.Scanner;

public class StringSubset 
{
    static void subsets(String str,String curr,int i){
        if(i== str.length()){
            System.out.println(curr);
            return;
        }
        subsets(str, curr, i+1);
        subsets(str, curr+str.charAt(i), i+1);
    }

    public static void main(String[] args) 
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("print the input: ");
        String str=sc.next();
        String curr="";
        subsets(str, curr, i);
        sc.close();
    }
}

// we can add the result in the array using array list and adding the subsequent recursive call result in the array by array_name.add(curr).
