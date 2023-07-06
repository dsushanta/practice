package abstraction;

public class Car implements Vehicle, Engine{
    @Override
    public void accelerate() {
        System.out.println("Accelerated Car");
    }

    @Override
    public void start() {
        System.out.println("Started Car");
    }
}
