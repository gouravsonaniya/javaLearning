package OOPS;

public class Inheritance {
    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();
       // shark.swim();

        Dog bobby = new Dog();
        bobby.eat();
        bobby.legs = 4;
        System.out.println(bobby.legs);

        Animal bachha = new Animal();

        Human people = new Human();
        people.legs = 4;
        System.out.println(people.legs);
        
    }
    
}
// base class (parent class)
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    int legs;
}
class Dog extends Mammal{
    int breed;
}

class Human extends Mammal{
    String speak;
}

class Bird extends Animal{
    String peacock;
}
class Fish extends Animal {
      int swims;
}
class tuna extends Fish{

}
 
// derived class( child class)
// class Fish extends Animal{
//         int fins;

//         void swim(){
//             System.out.println("swims in water");
//         }
// }



