import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("*****add methods*****");
        // add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        list.add(1, "orange"); // add at specific index
        System.out.println(list);
        System.out.println("*****get methods*****");

        // get elements from the list
        System.out.println(list.get(0)); // get first element
        System.out.println(list.get(2)); // get third element
        System.out.println("*****remove methods*****");

        // remove elements from the list
        list.remove(1); // remove second element
        System.out.println(list);
        list.remove("cherry"); // remove specific element
        System.out.println(list);
        System.out.println("*****size method*****");

        // get the size of the list
        System.out.println(list.size());
        System.out.println("*****contains method*****");

        // check if an element exists in the list
        System.out.println(list.contains("banana")); // true
        System.out.println(list.contains("grape")); // false    
        
    }
}
