abstract class Animal{
abstract void colour();
abstract void  age();

void common (){
	System.out.println("It is a Mammal");
}
}
class dog extends Animal{
String colour= "black";
int age = 5;

void colour(){
	super.common();
System.out.println("Colour is "+colour);
}
void age(){
System.out.println("Age  is "+age);
}
}
class elephant extends Animal{
String colour= "brown";
int age = 25;

void colour(){
	super.common();
System.out.println("Colour is "+colour);
}
void age(){
System.out.println("Age  is "+age);
}
}
class MethodOverriding3{
public static void main(String []args){
Animal m;
m=new dog();
m.colour();
m.age();
m=new elephant();
m.colour();
m.age();
}
}