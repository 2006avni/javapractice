abstract class Shape {

    abstract void calculate_area();

    void display_info() {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate_area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculate_area() {
        int area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        s1.display_info();
        s1.calculate_area();

        Shape s2 = new Rectangle(4, 6);
        s2.display_info();
        s2.calculate_area();
    }
}