//multilevel ineritance

//parent class
public class Animal{
        void eat(){
            System.out.println("I am eation");
        }
    //child class 1
    static class Dog extends Animal{
        void bark(){
            System.out.println("I barks");
        }
    }
    //child class 2
    static class Cat extends Animal {
        void meow(){
            System.out.println("meow");
        }
    }  
    
    public static void main(String[] args) {
        System.out.println("-------By parent class");

        Animal obj=new Animal();
        obj.eat();
        //child class 1 ka object se child and parent dono ko call kar sakte hain
        System.out.println("-------By child class 1");

        Dog obj2=new Dog();
        obj2.bark();
        obj2.eat();
        //child class 1 ka object se child and parent dono ko call kar sakte hain
        System.out.println("------By child class 2");
        Cat obj3=new Cat();
        obj3.meow();
        obj3.eat();

        
    }
    
}
