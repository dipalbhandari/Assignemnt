import java.util.Scanner;
class Customer {

	String name;
	float amount;
	static String bankName;

}

class Manager {

	int empId;
	float salary;
	static String branchName;

}



class bankDemo {
	public static void main (String args[]){

		Scanner sc = new Scanner (System.in);
		System.out.println("Customer Detail ");


		Customer cs = new Customer();
		Manager m = new Manager();


		cs.name = sc.next();
		cs.amount =  sc.nextFloat();
		cs.bankName = sc.next();

		System.out.println("Name is " + cs.name+ "amount: " + cs.amount + "BankName " + cs.bankName);
 
		System.out.println("Manager Detail ");
		m.empId = sc.nextInt();
		m.salary =  sc.nextFloat();
		m.branchName = sc.next();
		System.out.println("EmpId is " + m.empId + "salary: " + m.salary + "BranchName " + m.branchName);


	}
}
