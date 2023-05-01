import java.util.Scanner;
class labtasks03
{
    public static boolean tsk3(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
       
        return tsk3(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[]args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the String to check:");
        String string = console.nextLine();
        if(tsk3(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}