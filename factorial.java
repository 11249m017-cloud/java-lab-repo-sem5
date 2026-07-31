import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
int fact=1,n;
Scanner s=new Scanner(System.in);
System.out.println( "Enter the the number" );
n=s.nextInt();
for (int i=1; i<=n; i++){
fact = fact*i;
}
System.out.println("the Factorial is "  + fact);
}
}
