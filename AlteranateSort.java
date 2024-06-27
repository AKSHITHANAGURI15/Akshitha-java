import java.util.*;
class AlternateSort
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++)
{
  for(int j=i+1;j<n;j++)
{
  if(a[i]>a[j])
{
  int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
int i;
for(int i=0;i<n/2;i++)
{
  System.out.print(a[n-i-1]+" "+a[i]+" ");
}
if(n%2==1)
System.out.print(a[i]);
}
}
  
