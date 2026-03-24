public abstract class Animal implements Interactable {

    String name;
    int age;
    boolean sex;

    public Animal(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public boolean getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String getGender() {
        String gender = (sex) ? "male" : "female";
        return gender;
    }

    public String getPronoun() {
        String pronoun = (sex) ? "he" : "she";
        return pronoun;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name +
                ", age=" + age +
                ", sex=" + getGender() + "]";
    }

    public abstract void play();
    public abstract void walk();
    public abstract void swim();
}
