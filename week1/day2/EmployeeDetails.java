package week1.day2;

public class EmployeeDetails {
public String printEmployeeName(String empName,int empID) {
	return empName;
	
}
public String getEmployeeAdress(String empAddress) {
	return empAddress;
}
public double EmployeeSalary(double empsalary) {
	return empsalary;
}
public long MobileNo(long empNo) {
	return empNo;
}
public static void main(String[] args) {
	EmployeeDetails ed=new EmployeeDetails();
	
	String Name=ed.printEmployeeName("Madhusudan", 12770);
	System.out.println(Name);
	String address=ed.getEmployeeAdress("chennai");
	System.out.println(address);
	double salary=ed.EmployeeSalary(50000);
	System.out.println(salary);
	long mobile=ed.MobileNo(9423254323l);
	System.out.println(mobile);
}

}
