public class ThreadDemo {

	public static void main(String[] args) throws Exception{
		
		Thread t1 = new Thread( ()->
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try { Thread.sleep(1000);} catch (Exception e) {}
			}
		},"Hi Thread");
		Thread t2= new Thread( () ->
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try { Thread.sleep(1000);} catch (Exception e) {}
			}
		},"Hello Thread");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");

	}

}
