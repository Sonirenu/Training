package Inheritance;
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}


class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal an=new Animal("Animal");
        an.speak();
        Dog myDog = new Dog("Dog");
        Cat myCat = new Cat("pushy");

        myDog.speak(); // Output: Buddy says Woof!
        myCat.speak(); // Output: Whiskers says Meow!

    }
}


