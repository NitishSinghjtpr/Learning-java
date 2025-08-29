package Inheritance;

class Animal {
    void eat(){
        System.out.println("I am eation");
    }
}
public class Dog extends Animal{
    void bark(){
        System.out.println("barking");
     }
     public static void main(String[] args) {
        Dog obj=new Dog();
        obj.bark();
        obj.eat();
    }
}
