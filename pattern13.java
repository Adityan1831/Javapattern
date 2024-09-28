package practise;

public class pattern13 {

	public static void main(String[] args) {
	int i,j,s=0,a=6;
	for(i=1;i<=6;i++) {
		for(j=0;j<=s;j++) {
			System.out.print(" ");
		}
		for(j=0;j<a;j++) {
			System.out.print("* ");
		}
		System.out.println();
		s++;
		a--;
	
	}
	}

}
