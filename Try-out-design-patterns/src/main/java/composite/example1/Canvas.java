package composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Canvas implements Shape{
    private final List<Shape> shapes;

    public Canvas() {
        this.shapes = new ArrayList<>();
    }

    public void addShapeToCanvas(Shape shape){
        shapes.add(shape);
    }

    public void removeShapeFromCanvas(Shape shape){
        shapes.remove(shape);
    }

    public void CleanCanvas(){
        shapes.clear();
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }
}
