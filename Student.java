class College {
  void list(){
	System.out.println("1. MIT" + "2. Harvard" + "3.Harvard");
}

 void Selected(String name){
 System.out.println("College Selected " + name);
 }


 String Cost(int fee){
 System.out.println("College amount" + fee );
 return "paid";
 }

}




 class Student{

 public static void main (String args[]){
 College c = new College();
 c.list();
 c.Selected("Harvard");
 System.out.println("Fee " + c.Cost(8000));
 }
 }






