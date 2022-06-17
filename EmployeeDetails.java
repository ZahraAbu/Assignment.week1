package assignment2.week1;

public class EmployeeDetails {
public static void main(String[] args) {
	EmployeeDetails obj = new EmployeeDetails();
	obj.printEmployeeName("Zahra", 12365489);
	String EmployeeAddress = obj.getEmployeeAddress("Tambaram, Chennai");
    obj.printEmployeeSalary(35689.35698);
    obj.printEmployeeMobileNumber(897563124L);
}

private void printEmployeeName(String empName, int empID) {
System.out.println(" Employee Name " +empName + " Employee ID " +empID);
}

private String getEmployeeAddress(String empAddress) {
System.out.println(" Employee Address " + empAddress);
return empAddress;
}

private void printEmployeeSalary(double empSalary) {
System.out.println(" Employee Salary " + empSalary);
}

private void printEmployeeMobileNumber(long mobNum) {
	System.out.println(" Mobile Number " +mobNum);
}

}