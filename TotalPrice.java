import java.io.*;      
abstract class Car{  
         protected double price;  
         abstract void getPrice();  
   
         public void totalAmount(int tax){  
              System.out.println(tax + price);  
          }  
}




class  Tesla extends Car{  
        //@override  
         public void getPrice(){  
             price=40000;              
        }  
   }

 

class  Toyota extends Car{  
   //@override  
    public void getPrice(){   
        price=55000;  
   }   

}


class GetCarFactory{  
       
       public Car getPlan(String carType){  
            if(carType == null){  
             return null;  
            }  
          if(carType.equalsIgnoreCase("TESLA")) {  
                 return new Tesla();  
               }   
   
          else (carType.equalsIgnoreCase("Toyota")) {  
                return new Toyota();  
          }  
      return null;  
   }  
}//end of GetPlanFactory class.  


   
class TotalPrice{  
    public static void main(String args[])throws IOException{  
      GetCarFactory carFactory = new GetCarFactory();  
        
      
     String name = "tesla";
     
  
      Car p = carFactory.getPlan(name);  
      int tax = 5000;
      
  
       System.out.print("Total cost for " +  name );  
           p.getPrice();  
           p.totalAmount(tax);  
            }  
    }


