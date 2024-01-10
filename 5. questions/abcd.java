public class abcd 
{
    public static void main(String[] args) 
    {
        recursion('a');
        
    }
//-----------------print abcd using recursion--------------------------------------
    static void recursion(char current)
    {
        System.out.println(current);
        if(current!='d')
          recursion((char) (current+1));
    }
//--------------------------factorial------------------------------------------

    
    
}