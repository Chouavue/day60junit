package com.win.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnimalTest {
 
    @Test
    void getName(){
        String dogName = "Theo";
        assertEquals("Theo", dogName);
    }
}
