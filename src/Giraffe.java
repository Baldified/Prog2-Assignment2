public class Giraffe extends Landables {

    public Giraffe(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void play() {
        System.out.println("Stomp Stomp Stomp");
    }

    @Override
    public void walk() {
        System.out.println("Stomp Stomp");
    }

    @Override
    public void swim() {
        System.out.println("This animal would rather not swim.");
    }

    @Override
    public void feed() {
        System.out.println("Crunk Crunk");
    }

    @Override
    public void observe() {
        System.out.println("This is " + this.name +
                             ", " + getPronoun() + " is " + this.age +
                              " years old, and " + getPronoun() + " is a " + getGender() + ".");
    }

    @Override
    public String toString() {
        return "Giraffe[" + super.toString() + "]";
    }
}
