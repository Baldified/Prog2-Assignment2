import java.util.ArrayList;
import java.util.Locale;

public class Zoo {
    ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }
    
    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Zoo(Zoo zoo) {
        this.animals = zoo.animals;
    } 

    public void playTime() {
        for (Animal a : animals)
            a.play();
    }

    public Animal findAnimalByName(String name) {
        for (Animal a : animals)
            if ((a.name).equals(name))
                return a;

        return null;
    }

    public void showSpecialAction(String name) {
        Animal a = findAnimalByName(name);
        if (a instanceof Landables)
            ((Landables) a).walk();
        else if (a instanceof Waterables)
            a.swim();
        else
            System.out.println("Animal not found");
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Zoo other = (Zoo) obj;

        if (animals.size() != other.animals.size()) return false;

        for (int i = 0; i < animals.size(); i++) {
            if (!animals.get(i).equals(other.animals.get(i))) return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "This zoo has " + animals.size() + " animals.";
    }
}
