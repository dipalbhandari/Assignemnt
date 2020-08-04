abstract class Restaurant{
abstract void takeOrder(String order);
abstract void takeOrder(String order1 , String order2);
}
class Everest extends Restaurant{

void takeOrder(String order){
System.out.println(" Everest order :"+order);
}
void takeOrder(	String order1 , String order2){
System.out.println("Order1 is  "+ order1 + "Order2 is " + order2);
}
}

class MethodOverriding4{
public static void main(String []args){
Restaurant r;
r=new Everest();
r.takeOrder("pizza");
r.takeOrder("Burger" , "Chicken fry");

}
}