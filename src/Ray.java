public class Ray extends Waterables {
    public Ray(String name, int age, boolean sex) {
        super(name, age, sex);
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
        System.out.println("This is " + this.name +
                             ", " + getPronoun() + " is " + this.age +
                              " years old, and " + getPronoun() + " is a " + getGender() + ".");
    }
    
    @Override
    public String toString() {
        return "Ray[" + super.toString() + "]";
    }
}
