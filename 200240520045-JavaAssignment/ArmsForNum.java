hii how are you

import java.util.Scanner;

public class ArmsForNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int temp=n;
		int a=0,rem;
		
		while(n > 0) {
			rem = n%10;
			n = n/10;
			a=a+(rem*rem*rem);
		}
		if(temp == a) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Non-Armstrong Number");
		}
	}

	}
