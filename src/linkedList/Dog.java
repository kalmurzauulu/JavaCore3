package linkedList;

public class Dog extends Animal{

    public Dog(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
