//demo is on synchronized

package comtns.assignment1;

class Counter
{
	int count;
	
	public synchronized void inc() {
		count++;
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c =new Counter();
		Thread t1 =new Thread(new Runnable() {//first thread
			public void run() {
				for(int i=0;i<10000;i++) {
					c.inc();

			}
		}}
		);
		Thread t2 =new Thread(new Runnable() {//second thread
			public void run() {
				for(int i=0;i<10000;i++) {
					c.inc();

			}
		}}
		);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);

	}

}
