package week1.day2;

public class Car {
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public void applyGear() {
		System.out.println("Apply 3rd Gear ");
		
	}
	public void switchOnAc() {
		System.out.println("On Ac");
	
	}
	public void apllyAccelerator() {
		System.out.println("Slowly apply accelerator ");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBrake();
		c.applyGear();
		c.apllyAccelerator();
		c.switchOnAc();
}
}
