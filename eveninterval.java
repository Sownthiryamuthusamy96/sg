import java.util.*;
import java.io.*;
public class Main
{
pubic static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
if(i%2==0)
System.out.println("even"+i);
}
}
}
