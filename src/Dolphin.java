
import java.util.Objects;

public class Dolphin extends Waterables implements Interactable {

    public Dolphin() {
        super();
    }

    public Dolphin(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public Dolphin(Dolphin dolphin) {
        super(dolphin);
    }

    @Override
    public void makeSound() {
        System.out.println("Wio Wio Wio");
    }

    @Override
    public void play() {
        System.out.println(this.name + " started playing with a ball.");
    }

    @Override
    public void walk() {
        System.out.println("Dolphins are unable to walk.");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " went for a swim.");
    }

    @Override
    public void feed() {
        System.out.println("You fed " + this.name + " some fish.");
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Dolphin other = (Dolphin) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
