import java.util.*;
class Bubblesort
{
static void bubblesort(int a[],int n)
{
for(int i=n-1;i>=1;i--)
 {
    for(int j=0;j<=i-1;j++)
   {
    if(a[j]>a[j+1])
    { 
      int t=a[j];
       a[j]=a[j+1];
       a[j+1]=t;
     }
   }
 }
}
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
          a[i]=sc.nextInt();
       }
        bubblesort(a,n);
        for(int i=0;i<n;i++)
       {
          System.out.print(a[i]+" ");
        }
      }
   }


