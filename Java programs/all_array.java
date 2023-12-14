// import java.util.Arrays;
// public class all_array 
// {
//     public static void main(String[] args) 
//     {
//         // int[] array_name; // initialized the array
//         // array_name= new int[3]; //means amount of memory we allocate is of 3 integers to array_name.
//         // // System.out.println(array_name[2]); //we get 0 because java default provide value 0 to all index.
//         // array_name[0]=10; //we provided the values to the index
//         // array_name[1]=20;
//         // array_name[2]=30;
//         // System.out.println(array_name[0]);
//         // System.out.println(array_name[1]);
//         // System.out.println(array_name[2]);
//         // for(int x=0; x<array_name.length;x++) //iterate through array
//         // {
//         //     System.out.println(array_name[x]);
//         // }

//         int[] array_2={2,34,5,6,7,5}; //intialization of array without new operator
//         for(int i=0;i<array_2.length;i++){
//             System.out.println(array_2[i]);
//         }
//     }
// }
// //--------------------------------ARRAYS OF STRINGS-------------------------------------------------------------------------------        
//         // String[] array_1={"hey","bye","hello"}; //we use string to initialize it
//         // // System.out.println(array_1[1]);
//         // //new way to iterate through the array using for loop
//         // for(String fruit:array_1) // java will set each value of array_1 to fruit
//         // {
//         //     System.out.println(fruit);
//         // }
// //--------------------------------MULTI DIMENSIONAL ARRAYS------------------------------------------
                // int[][] table=new int[10][20]; //another way to initialize the 2d array
//             // int[] one_d={1,2,3,4,5}; //1-d array
//             // System.out.println(Arrays.toString(one_d)); //to use this we have to import Arrays class librarires to print the array as whole
//             int[][] two_d={{1,2,234},{2,3},{3,4}}; //2-d array
//             System.out.println(two_d[1][1]); // row=1 i.e {2,3} and value=1 i.e 3. 
//             System.out.println(two_d[0][2]); // output is 234
//             // System.out.println(two_d.length); // length is 3 i.e it shows how many rows are there.
//             for(int row=0;row<two_d.length;row++)
//             {
//                 for(int col=0;col<two_d[row].length;col++)
//                 {
//                     System.out.print(two_d[row][col]+" ");
//                 }
//                 System.out.println();
                
//             }
//     }
// }
//--------------------------------------------------------SORTING ARRAY-------------------------------------------------------------------
// public class all_array
// {
//     public static void main(String[] args) 
//     {
//         int[] num={99,-10,100123,18,-978,5623,463,-9,278,9}; //initalize he array
//         int a,b,t;  //initialize the variables which we need.
//         int size=10; //number of elemnts to be sorted...
//         System.out.print("original array is: ");
//         for(int i=0;i<size;i++) //display original array
//         {
//             System.out.print(" "+num[i]);
//         }System.out.println();
//     // now we do the bubble sort of array
//         for(a=1;a<size;a++)
//             for(b=size-1;b>=a;b--)
//             {
//                 if(num[b-1]>num[b])
//                 {
//                     t=num[b-1];
//                     num[b-1]=num[b];
//                     num[b]=t;
//                 }
//             }
//             System.out.print("sorted array is: ");
//             for(int i=0;i<size;i++)
//                 System.out.print(" "+num[i]);
//                 System.out.println();
//     }
// }
//------------------------------------------------ using length member------------------------------------------------------------------------
// public class all_array
// {
//     public static void main(String[] args) 
//     {
//-----------using length to do everything
        // int[] list1= new int[10];
        // int[] list2={1,2,3};
        // int[][] table1={
        //     {1,2,3}, {2,3},{1,3}};
        // System.out.println("length of list1 " +list1.length);  //to know the legth of array
        // System.out.println("length of list2 " +list2.length);
        // System.out.println("length of table1 " +table1.length);//show 3 because it calculate how many arrays are in the 2d array
        // System.out.println("length of table1 of array at index 1 is  " +table1[1].length); //to check length of specific array
        // System.out.println();
        // //use length to initialize array i.e put elemnts in the array
        // for(int i=0;i<list1.length;i++)
        //     list1[i]=i*i;
        //     System.out.print("list1 is ");
        //     for(int i=0;i<list1.length;i++)
        //         System.out.print(" "+list1[i]);
        //         System.out.println();
//----------------------------------------copy one array to another array---------------------------------------
//             int i;
//             int[] nums1=new int[5];
//             int[] nums2=new int[6]; //given size
//             for(i=0;i<nums1.length;i++) //putting values in array using length
//                 nums1[i]=i;
//             //copy nums1 to nums2
//             if(nums2.length>=nums1.length)
//                 for(i=0;i<nums1.length;i++)
//                     nums2[i]=nums1[i];
//             for(i=0;i<nums2.length;i++)
//                 System.out.print(" "+nums2[i]);
// // output is 0 1 2 3 4 0... 0 because size is 6
//     }
// }
