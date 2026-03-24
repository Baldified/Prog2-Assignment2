public class Waterables extends Animal {

    public Waterables(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void play() {}

    @Override
    public void walk() {}

    @Override
    public void swim() {}

    @Override
    public void feed() {}

    @Override
    public void observe() {}

    @Override
    public String toString() {
        return "Waterables[" + super.toString() + "]";
    }
}
