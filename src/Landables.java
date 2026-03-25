
import java.util.Objects;

public class Landables extends Animal {

    public Landables() {
        super();
    }

    public Landables(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public Landables(Landables landables) {
        super(landables);
    }

    @Override
    public void makeSound() {
        System.out.println("Land animal sound");
    }

    @Override
    public void play() {
        System.out.println("Land animal playing");
    }

    @Override
    public void walk() {
        System.out.println("Land animal walking");
    }

    @Override
    public void swim() {
        System.out.println("Land animal swimming");
    }

    @Override
    public String toString() {
        return "Landables[" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Landables other = (Landables) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
