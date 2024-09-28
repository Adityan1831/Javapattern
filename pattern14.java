package practise;

public class pattern14 {

	public static void main(String[] args) {
		int i,j,s=0,a=6,p=1;
		for(i=1;i<=6;i++) {
			for(j=0;j<=s;j++) {
				System.out.print(" ");
			}
			p=i;
			for(j=0;j<a;j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
			s++;
			a--;
		

	}
	}
}

