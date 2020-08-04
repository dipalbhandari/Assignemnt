class Animal{
void colour(){
System.out.println(" No Cost");
}
void  age(){
System.out.println("No model");
}
}
class dog extends Animal{
String colour= "black";
int age = 5;
void colour(){
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
System.out.println("Colour is "+colour);
}
void age(){
System.out.println("Age  is "+age);
}
}
class MethodOverriding{
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