package animals;

import fruit.Apple;
import fruit.Fruit;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;       //Animal không implement Edible nên không gọi trực tiếp howtoEat() được
                System.out.println(edible.howtoEat());
            }
            if (animal instanceof Tiger){
                Edible edible = (Tiger) animal;
                System.out.println((edible.howtoEat()));
            }
        }
        System.out.println();
        Fruit apple = new Apple();
        System.out.println(apple.howtoEat());   //Fruit có implement nên gọi được howtoEat
    }
}
