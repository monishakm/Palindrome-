import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuffer s1=new StringBuffer(a);
        s1.reverse();
        String s2=s1.toString();
        System.out.println(a.equals(s2)?"yes":"no");
    }
}

