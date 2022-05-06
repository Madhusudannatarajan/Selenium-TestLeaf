package selinum;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=1234553232L;
	boolean isPunctured=true;
	String bikeName="java";
	double runningKm=8812.2122;
	
	public static void main(String []args) {
		TwoWheeler tw=new TwoWheeler();
		String bn = tw.bikeName;
		System.out.println(bn);
		long cn=tw.chassisNumber;
		System.out.println(cn);
		boolean punctured = tw.isPunctured;
		System.out.println(punctured);
		System.out.println(tw.noOfWheels);
		System.out.println(tw.runningKm);
		System.out.println(tw.noOfMirrors);
	}


	}


