public class Dolphin extends Waterables {

    public Dolphin(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void play() {
        System.out.println("Gloo Gloob Gloo");
    }

    @Override
    public void walk() {
        System.out.println("This animal is unable to walk");
    }

    @Override
    public void swim() {
        System.out.println("Gloo Gloo");
    }

    @Override
    public void feed() {
        System.out.println("Fuh Fah Fuh");
    }

    @Override
    public void observe() {
        System.out.println("This is " + this.name +
                             ", " + getPronoun() + " is " + this.age +
                              " years old, and " + getPronoun() + " is a " + getGender() + ".");
    }

    @Override
    public String toString() {
        return "Dolphin[" + super.toString() + "]";
    }
}
