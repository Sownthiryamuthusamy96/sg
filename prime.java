import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int i,j;
for(i=1;i<n;i++)
{
for(j=i;j>=1;j--)
{
if(i%j==0)
{
count++;
}
if(count==2)
System.out.println("prime number");
else
System.out.println("not a prime number");
}
}
}
}
