class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class ShapeD {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display();
        c.area();

        r.display();
        r.area();
    }
}