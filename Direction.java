import java.util.*;
class Direction
{
 public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
 int n=s.nextInt();
int x=0,y=0,units=10;
char dir='R';
for(int i=1;i<=n;i++)
{
  if(dir=='R')
{
x=x+units;
units=units+10;
dir='U';
}
else if(dir=='U')
{
y=y+units;
units=units+10;
dir='L';
}
else if(dir=='L')
{
x=x-units;
units=units+10;
dir='D';
}
else if(dir=='D')
{
   y=y-units;
  units=units+10;
  dir='A';
}
else if(dir=='A')
{
x=x+units;
units=units+10;
dir='R';
}
}
System.out.println(x+" "+y);
}
}




