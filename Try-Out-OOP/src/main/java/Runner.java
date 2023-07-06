import abstraction.Car;
import abstraction.Engine;
import abstraction.Vehicle;

class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.applyBrake();
        Vehicle.stop();
        Engine.stop();
    }

    public static void main(int[] args) {
        System.out.println("hello");
    }
}
