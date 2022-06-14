package week6.day1;

import java.util.Iterator;

public class LearnJumpStatement {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			if(i==3) {
				System.out.println("Three");
			continue;
			}
			
			System.out.println(i);
			
		}
	}

}
	
