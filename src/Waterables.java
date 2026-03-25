
import java.util.Objects;

public class Waterables extends Animal {

    public Waterables() {
        super();
    }

    public Waterables(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public Waterables(Waterables waterables) {
        super(waterables);
    }

    @Override
    public void makeSound() {
        System.out.println("Water animal sound");
    }

    @Override
    public void play() {
        System.out.println("Water animal playing");
    }

    @Override
    public void walk() {
        System.out.println("Water animal walking");
    }

    @Override
    public void swim() {
        System.out.println("Water animal swimming");
    }

    @Override
    public String toString() {
        return "Waterables[" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Waterables other = (Waterables) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
