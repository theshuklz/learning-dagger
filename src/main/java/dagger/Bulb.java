package dagger;

import javax.inject.Inject;

public class Bulb {

    Button button;

    @Inject
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
