public abstract class Animal implements Interactable {

    String name;
    int age;
    boolean sex;

    public String getSex() {
        String gender;
        if (sex) gender = "male";
        else gender = "female";
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract void play();
    public abstract void walk();
    public abstract void swim();
}
