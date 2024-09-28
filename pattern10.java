package practise;

public class pattern10 {

	public static void main(String[] args) {
	int space=8,a=11;
	for(int i=0;i<5;i++) {
		for(int j=0;j<space;j++) {
			System.out.print(" ");
		}
		for (int k=0;k<=i;k++) {
			System.out.print(a+" ");
			a++;
		}
		space--;
		System.out.println();
	}
	}
	
}
