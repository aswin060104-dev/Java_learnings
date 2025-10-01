public class learn_interface{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void Meow(){
        System.out.println("Cat meow");
    }
}