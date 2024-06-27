import java.util.*;
class MergeSort
{
 public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int a[]=new int[n];
 for(int i=0;i<n;i++)
{
  a[i]=s.nextInt();
}
 int m=s.nextInt();
  int b[]=new int[m];
for(int j=0;j<m;j++)
{
  b[j]=s.nextInt();
}
int c[]=new int[m+n];
int k=0;
for(int i=0;i<n;i++)
{
  c[k]=a[i];
 k++;
}
   for(int i=0;i<m;i++)
{
    c[k]=b[i];
    k++;
}
Arrays.sort(c);
for(int i=0;i<k;i++)
{
 System.out.print(c[i]+" ");
}
}
}



