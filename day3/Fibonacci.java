package week1.day3;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int range =10;
		range++;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
