
import java.util.Objects;

public class Giraffe extends Landables implements Interactable {

    public Giraffe() {
        super();
    }

    public Giraffe(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public Giraffe(Giraffe giraffe) {
        super(giraffe);
    }

    @Override
    public void makeSound() {
        System.out.println("Hur Hur Hur");
    }

    @Override
    public void play() {
        System.out.println(this.name + " started playing with a stick.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " started walking around.");
    }

    @Override
    public void swim() {
        System.out.println("Giraffes would rather not swim.");
    }

    @Override
    public void feed() {
        System.out.println("You fed " + this.name + " some hay.");
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Giraffe other = (Giraffe) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
