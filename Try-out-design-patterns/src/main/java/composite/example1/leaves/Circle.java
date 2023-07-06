package composite.example1.leaves;

import composite.example1.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle ");
    }
}
