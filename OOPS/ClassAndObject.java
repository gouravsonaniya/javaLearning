package OOPS;

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
       // p1.setColor("yellow");
       p1.setColor("yellow");
        System.out.println(p1.getColor());
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Gourav";
        myAcc.setPassword("Patel"); 
    }
    
}

class BankAccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        password = pwd;
    }


}

class Pen {
   private  String color;
   private int tip;

   String getColor(){
    return this.color;
   }

   int getTip(){
    return this.tip;
   }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
