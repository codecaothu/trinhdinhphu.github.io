package lab6_exercise1.exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        //test animal
        Animal animal1 = new Animal("Beggy");
        System.out.println("Animal[: " + animal1.toString() + "]");
        ;

        //Mammal
        Mammal mammal = new Mammal("Human");
        System.out.println("Mammal[: " + mammal.toString() + "]");

        //Cat
        Cat pinkCat = new Cat("wendy");
        System.out.println("Cat[: " + pinkCat.toString() + "]");
        pinkCat.greets();

        //dog
        Dog blackDog = new Dog("beck");
        System.out.println("Dog[: " + blackDog.toString() + "]");
        blackDog.greets();
        blackDog.greets(blackDog);//another dog
    }

}
