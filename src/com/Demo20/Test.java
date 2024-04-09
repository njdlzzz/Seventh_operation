package com.Demo20;

public class Test {
    public static void main(String[] args) {
        Instrument [] musical = new Instrument[3];
        musical[0] = new Wink();
        musical[1] = new Percussion();
        musical[2] = new Stringed();
        for (int i = 0; i < musical.length; i++) {
            musical[i].play();
        }
    }
}
