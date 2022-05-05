package structural.bridge;

import java.security.Key;

public abstract class Computer {

    protected Keyboard keyboard;
    protected Computer (Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public abstract void printToScreen();


}
