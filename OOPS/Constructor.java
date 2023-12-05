package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student sc = new Student();
        
    }
    
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called ");
    }
}
