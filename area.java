 class Rectangle {
    private double length;
    private double width;


    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }

    
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

   public class area {
   
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
   }