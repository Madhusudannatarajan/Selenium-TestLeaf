package week6.day1;

public class UseCard {
	public static void main(String[] args) {
		PersonalPayment payment = new PersonalPayment();
		payment.setCreditCardNumber("5555 6666 7777 8888");
		System.out.println(payment.getCreditCardNumber());
		
	}

}
