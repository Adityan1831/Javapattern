package practise;

import java.util.Scanner;

public class pattarn3 {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		char ch='A';
		for(int i=0;i<4;i++) {
			
			System.out.println();
			for(int j=0;j<i;j++)
			System.out.print((char)ch);
			ch=(char)(ch+1);
		}

	}

}
