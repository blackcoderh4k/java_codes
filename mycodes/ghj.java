package mycodes;

class innerghj {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println("The sum of the numbers is " + c);
    }
}

public class ghj {
    public void displaymessage() {
        innerghj obj = new innerghj();
        obj.sum(52, 78);
        System.out.println("My name is Jhonn");
    }

    // public static void main(String[] args) {
    //     ghj obj = new ghj();
    //     obj.displaymessage();
    // }
}