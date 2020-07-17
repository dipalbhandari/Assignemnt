class Res {
  void menu(){
	System.out.println("1. burger" + "2. chicken" + "3.dal");
}

 void Selected(String name){
 System.out.println(" Selected " + name);
 }


 String Cost(int fee){
 System.out.println(" amount" + fee );
 return "paid";
 }

}




 class Menu{

 public static void main (String args[]){
 Res c = new Res();
 c.menu();
 c.Selected("burger");
 System.out.println("Fee " + c.Cost(8000));
 }
 }






