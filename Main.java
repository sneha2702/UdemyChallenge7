/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

 class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String names;

    public Car(int cylinders, String names) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.names=names;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getNames() {
        return names;
    }
    
    public String startEngine(){
       return "car -> Engine started";  
    }
    public String accelerate(){
       return "car -> accelerated";
    }
    public String brake(){
        return " car -> brakes applied";
    }
    
    
}

class Compact extends Car{
    
     public Compact() {
        super(4, "compact");
    }
    @Override
    public String startEngine(){
        return "compact -> engine started";
    }
    @Override
    public String accelerate(){
       return "compact -> accelerated";
    }
}
class Sedan extends Car{
    
    public Sedan() {
        super(4,"sedan");
    }
   
    @Override
    public String startEngine(){
       return "compact -> Engine Started";
    }
    @Override
    public String accelerate(){
      return "compact -> Accelerated. ";
    } 
    @Override
     public String brake(){
        return " sedan -> brakes applied";
    }
    
}
class SUV extends Car{
    
    public SUV() {
        super(6,"suv");
    }
    
    @Override
    public String accelerate(){
        return "compact -> Accelerated. ";
    }
}

public class Main{
    public static void main(String[] args) {
       
       for(int i=1;i<=3;i++)
       {
           Car value=myMethod();
           System.out.println(i+":"+value.getNames()+value.accelerate()+","+value.brake());
       }
    }
    public static Car myMethod(){
        int caseNumber= (int)((Math.random()*2)+1);
        System.out.println(caseNumber);
        switch(caseNumber){
            case 1: 
                return new Compact();
            case 2:
                return new Sedan();
            case 3:
                return new SUV();
            default:
                return null;
        }
    }
}
