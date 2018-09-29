import dagger.Bulb;
import dagger.DaggerBulbComponent;

public class Main {
    public static void main(String[] args) {
        Bulb bulb = DaggerBulbComponent.builder().build().getBulb();
        bulb.turnOn();
        System.out.println(bulb.isTurnedOn());
    }
}
