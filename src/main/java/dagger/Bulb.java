package dagger;

public class Bulb {

    Button button;
    String color;

    public Bulb(Button button) {
        this.button = button;
    }

    public void turnOn(){
        button.setState(true);
    }

    public void turnOff(){
        button.setState(false);
    }

    public boolean isTurnedOn(){
        return button.getState();
    }


}
