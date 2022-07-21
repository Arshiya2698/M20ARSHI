//pgm to get thread name
package comtns.assignment1;
class Idle extends Thread{
	
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());// gets  the name of the currently-running thread
		 System.out.println("arshiya");

		
	}
}
class Threadname extends Thread{
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());//Thread1
		
			System.out.println("Ansari");
		
	}
}

public class Wait {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Idle t1=new Idle();
		Threadname t2=new Threadname();
		t1.start();
		t2.start();
		 System.out.println(Thread.currentThread().getName());//main

	}

}
