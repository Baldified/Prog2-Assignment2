
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ray ray1 = new Ray("A", 3, true);
        Ray ray2 = new Ray("B", 5, false);

        Dolphin dol1 = new Dolphin("C", 7, true);
        Dolphin dol2 = new Dolphin(dol1);

        Giraffe gif1 = new Giraffe("D", 32, false);
        Giraffe gif2 = new Giraffe("E", 12, false);

        Monkey monk1 = new Monkey("F", 5, true);
        Monkey monk2 = new Monkey("G", 6, true);

        ray1.observe();
        ray1.feed();
        ray1.play();
        ray1.swim();
        ray1.walk();
        System.out.println(ray1.toString());
        System.out.println(ray1.equals(ray2) + "\n");

        dol1.observe();
        dol1.feed();
        dol1.play();
        dol1.swim();
        dol1.walk();
        System.out.println(dol1.toString());
        System.out.println(dol1.equals(dol2) + "\n");

        gif1.observe();
        gif1.feed();
        gif1.play();
        gif1.swim();
        gif1.walk();
        System.out.println(gif1.toString());
        System.out.println(gif1.equals(gif2) + "\n");

        monk1.observe();
        monk1.feed();
        monk1.play();
        monk1.swim();
        monk1.walk();
        System.out.println(monk1.toString());
        System.out.println(monk1.equals(monk2) + "\n");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(ray1);
        animals.add(ray2);
        animals.add(dol1);
        animals.add(dol2);
        animals.add(gif1);
        animals.add(gif2);
        animals.add(monk1);
        animals.add(monk2);

        Zoo zoo = new Zoo(animals);
        System.out.println(zoo.toString());
        zoo.fun();
    }
}