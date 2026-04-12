package oops;
/*
 * We use the abstract keyword to create abstract classes and methods.
 * An abstract method doesn't have any implementation (method body).
 * A class containing abstract methods should also be abstract.
 * We cannot create objects of an abstract class.
 * To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
 * A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
 */

//Example 1
abstract class MotorBike {
    abstract void breaks();

    void sound() {
        System.out.println("Sound of Moterbike Bike");
    }

    void biker() {
        System.out.println("I am a Super Biker");
    }
}
class MountainBike extends MotorBike {

    void breaks() {
        System.out.println("Mountain Bike Break!!");
    }

    void biker() {
        System.out.println("I am a Mountain Biker");
    }
}
class SportsBike extends MotorBike {

    public void breaks() {
        System.out.println("Sprots Bike Break!!");
    }

    public void biker() {
        System.out.println("I love to Ride Sport Bike!!");
    }
}
//Example 2.
abstract class Animal {
    //abstract method
    abstract void makesound();

    // Default Method
    public void eat() {
        System.out.println("I can eat");
    }
}
class Dogs extends Animal {

    public void makesound() {
        System.out.println("Bark Bark!!!!");
    }

}

class Abstraction {
    public static void main(String[] args) {
        // Can Create a object of abstract class....
        //MotorBike obj1 = new MotorBike(); 
        MountainBike obj  = new MountainBike();
        SportsBike obj1  = new SportsBike();
         //object of the Mountain Bike.
         obj.breaks();
         obj.biker();
         obj.sound();

         //Method Call For Sports Bike
         obj1.breaks();
         obj1.biker();
         obj1.sound();
        Dogs d1  = new Dogs();
        d1.eat();
        d1.makesound();

    }
}