public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        dog.eat("dog treat");
        cat.eat("fish");
        dog.showMood();
        cat.showMood();
    }
}
