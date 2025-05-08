// abstract class Payment { 
//     abstract void pay(int a); 

//     void success() { 
//         System.out.println("Payment done"); 
//     } 
// } 

// class UpiPayment extends Payment { 
//      void pay(int a) { 
//         System.out.println("Pay via UPI"+ a); 
//     } 
// } 

// class NetBanking extends Payment { 
//     void pay(int b) { 
//         System.out.println("Pay via Net Banking"+ b); 
//     } 
// } 

// public class ab { 
//     public static void main(String[] args) { 
//         Payment obj1 = new UpiPayment(); 
//         obj1.pay(250000); 
//         obj1.success(); 

//         Payment obj2 = new NetBanking(); 
//         obj2.pay(5); 
//         obj2.success(); 
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