package selinum;

public class Mobileobject {

		String MobileName="Iphone";
		char firstLetter='I';
		short ramsize=6;
		int memory=32;
		boolean isDamaged=true;
		double price=40000.000;
		long ipAddress=23543421;
		float frequencyRange=2.54f;
		private static long ipAddress2;
		
		public static void main(String[] args) {
			Mobileobject mob=new Mobileobject();
			long ipAddress3 = mob.ipAddress;
			System.out.println(ipAddress3);
		
			   
		}

	}


