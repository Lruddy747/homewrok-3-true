public class Circle extends GeometricObject {

    double radius;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        double area = Math.PI * radius * radius;

        return area;
    }

    @Override
    public double getPerimeter() {

        double circumference = 2 * Math.PI * radius;

        return circumference;
    }


    @Override
    public Boolean compare(GeometricObject obj, GeometricObject obj2) {

        if(obj.getArea() == obj2.getArea()){
            return true;
        }

        return false;
    }
}
