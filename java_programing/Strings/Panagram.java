import java.util.Scanner;
class Panagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  String");
String st=sc.nextLine();
boolean rs=isPanagram(st);
if(rs)
System.out.println("String is Panagram");
else
System.out.println("String is not Panagram");
}

static boolean isPanagram(String st)
{
int count[]=new int[26];
for(int i=0;i<st.length();i++)
{
char ch=st.charAt(i);
if(ch>=65 && ch<=90)
count[ch-65]++;
else if(ch>=97 && ch<=122)
count[ch-97]++;
}
for(int i=0;i<count.length;i++)
{
if(count[i]==0)
return false;
}
return true;
}
}