import dagger.Bulb;
import dagger.BulbFactory;

public class Main {
    public static void main(String[] args) {
        Bulb bulb = new BulbFactory().getBulb();
        bulb.turnOn();
        System.out.println(bulb.isTurnedOn());
    }
}
