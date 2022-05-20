package com.win.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CounterTest {
    int value = 3;
    @Test
    public void  Increase(){
        value ++;
    
    assertEquals(4, value ++);
    }
}
