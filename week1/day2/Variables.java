package week1.day2;

public class Variables {
	public float add(float a,float b) {
		float total=a+b;
		return total;
		
		
	}
	public void sub(float total,int b) {
		float c=total-b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Variables V=new Variables();
		float total=V.add(21,23);
		System.out.println(total);
		V.sub(total,7);
		
	}
}
