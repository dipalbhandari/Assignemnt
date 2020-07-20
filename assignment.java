 class Animal {

	String name ;
	String type;
	int year;


}

 class Assignment {
	public static void main (String args[]){

		Animal an = new Animal();

		an.name = "Dog";
		an.type = "mammmal";
		an.year = 4;

		System.out.println("Name is " + an.name + "Type: " + an.type + "year " + an.year);

	}
}