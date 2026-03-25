
import java.util.Objects;

public class Ray extends Waterables implements Interactable{

    public Ray() {
        super();
    }

    public Ray(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    public Ray(Ray ray) {
        super(ray);
    }

    @Override
    public void makeSound() {
        System.out.println("clic clic clic");
    }

    @Override
    public void play() {
        System.out.println(this.name + " started playing around.");
    }

    @Override
    public void walk() {
        System.out.println("Rays are unable to walk.");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " went for a swim.");
    }

    @Override
    public void feed() {
        System.out.println("You fed " + this.name + " some crab.");
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Ray other = (Ray) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
