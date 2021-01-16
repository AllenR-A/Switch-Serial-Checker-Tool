package com.switchcheck;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test // Done
    void main() {
        //assertEquals("Picked Factory Pattern", Main.pick(1));
        //assertEquals("Picked State Pattern", Main.pick(2));
        //assertEquals("Picked Composite Pattern", Main.pick(3));
    }

    @org.junit.jupiter.api.Test // Done, replaced the temporary [serialin = "XXXX1234567890"] with [serialin = scan.nextLine()]
    void serialInput(){
        assertEquals("XXXX1234567890", Main.serialInput());
    }
}