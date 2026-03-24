public class Ray extends Waterables {
    public Ray(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public void play() {
        System.out.println("Flop Flomp Flop");
    }

    @Override
    public void walk() {
        System.out.println("This animal is unable to walk");
    }

    @Override
    public void swim() {
        System.out.println("Flop Flop");
    }

    @Override
    public void feed() {
        System.out.println("Gobble Gobble Gobble");
    }

    @Override
    public void observe() {
        System.out.println("This is " + this.name + ", he is " + this.age + " years old, and he is a " +  + ".");
    }
}
