class Bank {
  void menu(){
	System.out.println("1. SENIOR" + "2. JUNIOT" + "3.ENTRY");
}

 void Selected(String name){
 System.out.println(" Selected " + name);
 }


 String Cost(int fee){
 System.out.println(" amount" + fee );
 return "paid";
 }

}




 class Employee{

 public static void main (String args[]){
 Bank c = new Bank();
 c.menu();
 c.Selected("Entry");
 System.out.println("Fee " + c.Cost(8000));
 }
 }






