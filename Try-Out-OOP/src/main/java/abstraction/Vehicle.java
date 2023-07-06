package abstraction;

public interface Vehicle extends Machine{
    void accelerate();

    public default void start(){        // Method is public by nature
        printNonStatic("Started vehicle");
    }
    default void applyBrake(){
        printNonStatic("Brake applied");
    }
    public static void stop(){          // Method is public by nature
        printStatic("Stopped vehicle");
    }

    private void printNonStatic(String text){
        System.out.println(text);
    }
    private static void printStatic(String text){
        System.out.println(text);
    }
}
