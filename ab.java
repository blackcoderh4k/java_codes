abstract class Payment { 
    abstract void pay(int a); 

    void success() { 
        System.out.println("Payment done"); 
    } 
} 

class UpiPayment extends Payment { 
     void pay(int a) { 
        System.out.println("Pay via UPI"+ a); 
    } 
} 

class NetBanking extends Payment { 
    void pay(int b) { 
        System.out.println("Pay via Net Banking"+ b); 
    } 
} 

public class ab { 
    public static void main(String[] args) { 
        Payment obj1 = new UpiPayment(); 
        obj1.pay(250000); 
        obj1.success(); 

        Payment obj2 = new NetBanking(); 
        obj2.pay(5); 
        obj2.success(); 
    } 
}