# VeerDiksha
class Hello
{
	synchronized void show()
	{
		Thread th=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getName()+"-SHOW :"+"\t"+this);
		}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Mythread extends Thread
{
	Hello h=null;
	Mythread(Hello h)
	{
		this.h=h;
	}
	public void run()
	{
		h.show();
	}
}
public class Lab581 {

	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		Mythread th1=new Mythread(h1);
		Mythread th2=new Mythread(h1);
		//Mythread th2 =new Mythread(h2);
		th1.start();
		th2.start();

	}

}

