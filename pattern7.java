package practise;

public class pattern7 {
	public static void main(String[] args) {
		int space=8;
		for(int i=0;i<5;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<=i;k++) {
				System.out.print("*");
				
			}
			space--;
			System.out.println();
		}
		}
}
