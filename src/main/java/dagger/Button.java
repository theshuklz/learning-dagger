package dagger;

import javax.inject.Inject;

class Button {
    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    private boolean state;

    @Inject
    Button() {
    }
}
