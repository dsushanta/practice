package composite.example1.leaves;

import composite.example1.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle ");
    }
}
