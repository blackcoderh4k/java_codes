// abstract class Shape {
//     abstract double area();
// }

// class Circle extends Shape {
//     private double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double area() {
//         return Math.PI * radius * radius;
//     }
// }

// class Rectangle extends Shape {
//     private double length, width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     double area() {
//         return length * width;
//     }
// }

// public class assigment {
//     public static void main(String[] args) {
//         Shape circle = new Circle(5);
//         Shape rectangle = new Rectangle(4, 6);

//         System.out.println("Circle Area: " + circle.area());
//         System.out.println("Rectangle Area: " + rectangle.area());
//     }
// }
// Abstract class Shape
abstract class Shape {
    abstract void area();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

// Main class
public class assigment {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.area();

        Shape rectangle = new Rectangle(4, 6);
        rectangle.area();
    }
}