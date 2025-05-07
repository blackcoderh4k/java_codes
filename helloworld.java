import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello world ");
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        
        
        int sum = a + b;
                
        System.out.println(sum);
        // int d= 10;
        // float f =9.52f;
        // String str ="hello";
        // boolean x = true;
        // char ch ='a';

        // System.out.println(d);
        // System.out.println(f);
        // System.out.println(str);
        // System.out.println(x);
        // System.out.println(ch);

              
        scanner.close();
        
    
    }
}
