import java.sql.Timestamp;

public class practice {

    public static void main(String[] args) {
        Timestamp t = new Timestamp(System.currentTimeMillis());
        long ts = t.getTime();
        System.out.println(ts);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ts);
    }
}
