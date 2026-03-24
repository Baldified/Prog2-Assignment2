public class Monkey extends Landables {

    public Monkey(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void play() {
        System.out.println("Bang Blomp");
    }

    @Override
    public void walk() {
        System.out.println("Stump Stump");
    }

    @Override
    public void swim() {
        System.out.println("This animal would rather not swim.");
    }

    @Override
    public void feed() {
        System.out.println("Nom Nom");
    }

    @Override
    public void observe() {
        System.out.println("This is " + this.name +
                             ", " + getPronoun() + " is " + this.age +
                              " years old, and " + getPronoun() + " is a " + getGender() + ".");
    }

    @Override
    public String toString() {
        return "Monkey[" + super.toString() + "]";
    }
}
