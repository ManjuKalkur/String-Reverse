import java.util.*;
class StringReverse
{
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:\n");
        str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("Reversed String is/t:"+rev);

    }
}