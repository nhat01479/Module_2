package animals;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrr!";
    }

    @Override
    public String howtoEat() {
        return "How to eat: no way";
    }
}
