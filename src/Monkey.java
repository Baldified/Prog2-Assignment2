
import java.util.Objects;

public class Monkey extends Landables implements Interactable {

    public Monkey() {
        super();
    }

    public Monkey(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public Monkey(Monkey monkey) {
        super(monkey);
    }

    @Override
    public void makeSound() {
        System.out.println("Oo Oo Aa Aa");
    }

    @Override
    public void play() {
        System.out.println(this.name + " started climbing a tree.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " started walking around.");
    }

    @Override
    public void swim() {
        System.out.println("Monkeys would rather not swim.");
    }

    @Override
    public void feed() {
        System.out.println("You fed " + this.name + " some bananas.");
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Monkey other = (Monkey) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
