public class HybridInheritance {
    public static void main(String[] args) {
        Shark s= new Shark();
        s.swim();
        s.eat();

        Bird b= new Bird();
        b.fly();
        b.eat();

        Mammal m= new Mammal();
        m.walk();
        m.eat();
    }
}

class Animal{
    String legs;
    void eat(){
        System.out.println("Eating...");
    }
}
class Fish extends Animal{
    int fin;
    void swim(){
        System.out.println("Swimming..");
    }
}

class Shark extends Fish{
    void sleep(){
        System.out.println("Sleeoing");
    }
}


class Bird extends Animal{
    void fly(){
        System.out.println("Flying..");
    }
}
class Crow extends Bird{
    void sound(){
        System.out.println("crowing..");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walking..");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Barking..");
    }
}