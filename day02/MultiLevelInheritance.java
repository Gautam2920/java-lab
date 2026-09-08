package day02;

class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.play();
    }
}
