import java.util.Scanner;
class PatternE
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of lines to print");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)(i+96)+" ");
}
System.out.println();
}
}
}