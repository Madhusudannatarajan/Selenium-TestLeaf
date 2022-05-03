package week1.day2;

public class ArithmeticOperator {
  public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
  public void sub() {
	  int a=12;
	  int b=18;
	  int c=a-b;
	  System.out.println(c);
  }

public static void main(String []args) {
	ArithmeticOperator ao=new ArithmeticOperator();
	ao.add();
	ao.sub();
}

}
