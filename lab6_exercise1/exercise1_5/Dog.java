package lab6_exercise1.exercise1_5;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.print("Woof");
    }

    public void greets(Dog anther){
        System.out.print("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[ " + super.toString() + " ]";
    }
}
