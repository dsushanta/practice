package lists;

import java.util.Vector;

/**
 * The Vector class implements a growable array of objects. Like an array, it contains components
 * that can be accessed using an integer index. However, the size of a Vector can grow or shrink
 * as needed to accommodate adding and removing items after the Vector has been created
 *
 * Vector is synchronized. If a thread-safe implementation is not needed,
 * it is recommended to use ArrayList in place of Vector.
 */
public class TryVectors {

    public TryVectors() {
    }

    public void function1(){
        Vector<String> chars = new Vector<>(4);
        chars.add("Chandler");
        chars.add("Joey");
        chars.add("Phoebe");
        chars.add("Monica");
        chars.add("Ross");

        chars.stream().forEach(System.out::println);
    }
}
