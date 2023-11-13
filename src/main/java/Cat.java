import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Miav miav ");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood() {
        System.out.println("hvæser");
    }
}
}
