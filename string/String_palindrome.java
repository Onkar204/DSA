public class Main 
{
    public static void main(String args[])
    {
        String s="hello";
        int left=0;
        int right=s.length()-1;
        int flag=0;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                System.out.print("not palindrome");
                flag=1;
                break;
            }
            
            left ++;
            right --;
        }
        if(flag!=1){
            System.out.print("palindrome");
        }
        
    }
}