import java.util.scanner;
public class Ascending order
{
public static void main (string[] args)
{
int n,temp;
scanner s=newscanner(system.in);
system.out.print("enter no.of elements you want in array:")
n=s.nextlnt();
int a[]=new int[n];
system.out.println("enter all the elements:")
for(int i=0; i<n; i++)
{
a[i]=s.nextint();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp =a[j];
a[i]=a[j];
a[j]=temp;
}
}
}
system.out.print("ascending order:");
for(int i=0;i<n-1;i++)
{
system.out.print(a[i]+",");
}
system.out.print(a[n-1]);
}
}

 
 