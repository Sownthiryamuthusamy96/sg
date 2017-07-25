import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BuferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
String s1=s.reverse();
if(s==s1)
System.out.println("Palindrome"+s);
else
System.out.println("not a Palindrome"+s);
}
}
