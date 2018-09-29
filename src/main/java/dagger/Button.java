package dagger;

import javax.inject.Inject;

class Button {
    private boolean state;

    @Inject
    Button() {
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
