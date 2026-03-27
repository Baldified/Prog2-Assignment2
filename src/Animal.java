
import java.util.Objects;

public abstract class Animal {

    protected String name;
    protected int age;
    protected boolean sex;

    public abstract void makeSound();
    public abstract void play();
    public abstract void walk();
    public abstract void swim();
    
    public Animal() {
    }

    public Animal(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Animal(Animal animal) {
        this.name = animal.name;
        this.age = animal.age;
        this.sex = animal.sex;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    public String getGender() {
        return sex ? "male" : "female";
    }

    public String getPronoun() {
        return sex ? "he" : "she";
    }

    @Override
    public String toString() {
        return "Animal[name=" + name +
                ", age=" + age +
                ", sex=" + getGender() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Animal other = (Animal) obj;

        if (!Objects.equals(this.name, other.name)) return false;
        if (this.age != other.age) return false;
        if (this.sex != other.sex) return false;
        
        return true;
    }
}
