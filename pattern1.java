package practise;

public class pattern1 {
	public static void main(String args[]) {
		
		
		int space = 2;
		int spa = 1;

		for (int i = 0; i <= 2; i++) {
			space = 2;
			spa = 1;
			System.out.print("*");

			for (int k = 0; k <= space; k++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int v = 0; v < spa; v++) {
				System.out.print(" ");
			}
			spa++;
			space--;
			System.out.print("*");

			for (int k = 0; k <= space; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int v = 0; v < spa; v++) {
				System.out.print(" ");
			}
			System.out.println("*");
			System.out.println();

		}
	}

}
