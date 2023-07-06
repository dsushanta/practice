package abstraction;

public interface Engine extends Machine{
    default void start(){
        System.out.println("Started engine");
    }
    static void stop(){
        System.out.println("Stopped engine");
    }
}
