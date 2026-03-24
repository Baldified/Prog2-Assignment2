public class Main {
    public static void main(String[] args) {
        Ray ray1 = new Ray("A", 3, true);
        Ray ray2 = new Ray("B", 5, false);

        ray1.observe();
        ray1.feed();
        ray1.play();
        ray1.swim();
        ray1.walk();
        System.out.println(ray1.toString());
    }
}