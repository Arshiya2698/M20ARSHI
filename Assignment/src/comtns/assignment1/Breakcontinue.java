package comtns.assignment1;

public class Breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
        {
	if(i == 3)
	 {
		continue;// break;
	 }
	System.out.println(i);
        }
		for(int i=1; i<=10; i++)
        {
	if(i == 5)
	 {
		break;
//		continue;// break;
	 }
	System.out.println(i);
        }

	}

}
