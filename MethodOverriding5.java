abstract class Car{
abstract void cost();
Car(String model){
System.out.println("Car "+model);
}
abstract void milage();
}


class Audi extends Car{

Audi(String model){
super("No model");
System.out.println("Model of Audi is "+model);
}
void cost(){
System.out.println("Cost of Audi is $50000");
}
void milage(){
System.out.println("Milage of Audi is 15km");
}
}
class Bmw extends Car{

Bmw(String model){
super("No model");
System.out.println("Model of Bmw is "+model);
}
void cost(){
System.out.println("Cost of BMW is 100000");
}
void milage(){
System.out.println("Milage of BMW is 10km");
}
}
class MethodOverriding5{
public static void main(String []args){
Car c;
c=new Audi("AUDI5");
c.cost();
c.milage();
c=new Bmw("BMW2");
c.cost();
c.milage();
}
}