class PrimeNUmbers
{
public static void main(String args[])
{
int i=0;
int num=0;
String primeNum="";
for(i=1;i<=10;i++)
{
int counter=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{
counter=counter+1;
}
}
if(counter==2)
{
primeNum=primeNumbers+i+"";
}
}
System.out.println("prime number from 1 to 10 are:");
System.out.println(primeNum);
}
}
