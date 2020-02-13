class Diksha extends Thread
{
public void run()
{
for(inti=1;i<=5;i++)
{
System.out.println("thread is running...");
}
}
public static void main(String args[])
{
Diksha d1=new Diksha ();
d1.start();
}}
