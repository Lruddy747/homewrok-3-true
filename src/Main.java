public class Main {
    public static void main(String[] args) {

        GeometricObject obj1 = new Circle("red", false, 10);
        GeometricObject obj2 = new Circle("green", true, 15);

        System.out.println(obj1.compare(obj1, obj2));


    }
}