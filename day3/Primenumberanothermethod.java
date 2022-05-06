package week1.day3;

public class Primenumberanothermethod {
	public static void main(String[] args) {
		int input=13;
		
		
		boolean flag=false;
		for(int i=2;i<=input-1;i++) {
			if(input%i==0) {
				flag=true;
				System.out.println("not prime");
			}
		}
		if(!flag) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
