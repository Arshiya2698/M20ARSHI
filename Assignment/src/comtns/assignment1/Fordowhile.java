package comtns.assignment1;

public class Fordowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=6 ; i++)   //(int i = 1000; i<=1;i--)
		{	
			System.out.print("Value of i:");
			System.out.println(i);
		}
		int i=97;
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		int l = 11;
		do
		{
			System.out.println(l);
			i++;
		}while(l<=1);

		for(int z=1,j=1; z<10||j<10;z++,j++)
		  { 
			j++;
			System.out.println("z="+z+" and j="+j);
		  }

	}

}
