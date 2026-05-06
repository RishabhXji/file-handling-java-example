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
        System.out.println("*****clear method*****");

        // clear the list
        list.clear();
        System.out.println(list);
        System.out.println("*****isEmpty method*****");

        // check if the list is empty
        System.out.println(list.isEmpty()); // true 
        System.out.println("*****set method*****");

        // set a new value at a specific index
        list.set(0, "mango");   
        System.out.println(list);
        System.out.println("*****indexOf method*****");
        // get the index of an element
        System.out.println(list.indexOf("mango")); // 0
        System.out.println("*****lastIndexOf method*****");
        // get the last index of an element
        list.add("mango");
        System.out.println(list.lastIndexOf("mango")); // 1
        System.out.println("*****toArray method*****");
        // convert the list to an array
        Object[] array = list.toArray();

        System.out.println(Arrays.toString(array));

        // last index of()
        System.out.println(list.lastIndexOf("mango")); // 1 
        System.out.println("*****sort method*****");
        // sort the list
        Collections.sort(list);
        System.out.println(list);
        //  for lopp
        System.out.println("*****for loop*****");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
         // for-each loop
        System.out.println("*****for-each loop*****");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
