package week4day1;

public class Bank implements Cibil,PNB {

	public void minimumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("minimumLoanAmount");
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("creditScore");
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("minimumBalance");
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("cibilScore");
	}
	
	public static void main(String[] args) {
		Cibil obj=new Bank();
		obj.cibilScore();
		
		PNB obj1=new Bank();
		obj1.creditScore();
		obj1.minimumBalance();
		obj1.minimumLoanAmount();
	}
	

}
