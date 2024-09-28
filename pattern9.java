package practise;

public class pattern9 {

	public static void main(String[] args) {
		int space=8,a,k;
		for(int i=1;i<=5;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			a=i;
			for(k=1;k<=i;k++) {
				
				System.out.print(a+" ");
				a++;
			}
			space--;
			System.out.println();
		}
	}

}
