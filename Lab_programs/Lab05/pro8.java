interface Animal {
    void makeSound();
}

class Dog implements Animal {
   
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void makeSound(String sound) {
        System.out.println("Dog makes sound: " + sound);
    }
}

class Cat implements Animal {
    
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void makeSound(int times) {
        System.out.println("Cat meows " + times + " times");
    }
}

public class pro8 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();

        Dog dog = new Dog();
        dog.makeSound("Woof!");

        Cat cat = new Cat();
        cat.makeSound(3);
    }
}
