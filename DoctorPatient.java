import java.util.Scanner;
class Patient {

	String name;
	float amount;


}

class Doctor {

	int empId;
	float salary;

}



class DoctorPatient {
	public static void main (String args[]){

		Scanner sc = new Scanner (System.in);
		System.out.println("Patient Detail ");


		Patient cs = new Patient();
		Doctor m = new Doctor();


		cs.name = sc.next();
		cs.amount =  sc.nextFloat();

		System.out.println("Name is " + cs.name+ "amount: " + cs.amount );
 
		System.out.println("Doctor Detail ");
		m.empId = sc.nextInt();
		m.salary =  sc.nextFloat();
		System.out.println("EmpId is " + m.empId + "salary: " + m.salary );


	}
}
