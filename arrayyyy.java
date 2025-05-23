import java.util.ArrayList;

// public class arrayyyy {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Hello");
//         list.add("World");
//         list.add("Java");
//         list.add("Programming");
//         list.add("Language");
//         list.add("ArrayList");  
//         list.add(1, "New");
//         list.remove(2);
//         list.set(3, "Updated");
//         list.add("New Element");    
//         System.out.println("List size: " + list.size());
//         System.out.println("List contents: " + list);
//         System.out.println(list);
//     }
// }
public class arrayyyy {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");  
        list.add("World");
        list.add("Java");
        list.add("Programming");

        list.add("Language");
        list.add("ArrayList");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
        list.set(1, "New");
        list.remove(2); 
        list.add("New Element");
        System.out.println("List size: " + list.size());
        System.out.println("List contents: " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}