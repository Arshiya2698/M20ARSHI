//program using wait method
package comtns.assignment1;

public class Wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("arshiya");
synchronized(args) {
	System.out.println("Ansari");

	try {
		args.wait();//wait method  can only be called from a synchronized block
		System.out.println("Living in kalaburagi");

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
System.out.println("Karnataka");

	}

}
