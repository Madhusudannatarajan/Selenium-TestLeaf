package week6.day2;

public class LearnException {
	public static void main(String[] args) {
		int x=10;
		int y=5;
		int[] num = {1,2,3,4};
		
		try {
			int z=x/y;
			System.out.println(z);
			System.out.println(num[5]);
			
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		catch(Exception e){
//			System.out.println(e);
	}
		finally {
		System.out.println("program completetd");
	}
}
}