package practise;

public class pattern12 {

	public static void main(String[] args) {

		int s=0;
		for (int i=0 ; i<5 ; i++)
		{
			for(int j=0;j<s;j++) {
				System.out.print(" ");
			}
			for(int j=i ;j<5 ; j++)
			{
				System.out.print("*");
			}
			s++;
			System.out.println();
		}

	}

}
