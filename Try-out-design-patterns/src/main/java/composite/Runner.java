package composite;

import composite.example1.Canvas;
import composite.example1.Shape;
import composite.example1.leaves.Circle;
import composite.example1.leaves.Triangle;

public class Runner {
    public static void main(String[] args) {
        var canvas = new Canvas();

        var shape1 = new Triangle();
        var shape2 = new Circle();

        canvas.addShapeToCanvas(shape1);
        canvas.addShapeToCanvas(shape2);

        canvas.draw();
    }
}
