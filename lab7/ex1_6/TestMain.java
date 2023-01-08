package lab7.ex1_6;

public class TestMain {
    public static void main(String[] args) {
        Dog dog = new Dog("LILI");
        System.out.println(dog.toString());
        dog.greets();
        Dog dog1 = new Dog("Chihuahua");
        System.out.println(dog1.toString());
        dog.greets(dog1);
        BigDog bigDog = new BigDog("Bull");
        System.out.println(bigDog.toString());
        bigDog.greets();
        bigDog.greets(dog1);
        BigDog bigDog1 = new BigDog("PhuQuoc");
        bigDog1.greets(bigDog1);
        Cat cat = new Cat("aln");
        System.out.println(cat.toString());
        cat.greets();
    }
}
