package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class BoxTest{
    
    int width= 5;
    int height = 10;

@Test
    void display(){
        System.out.println("width is " + this.width+ " and height is "+ this.height);
    
 assertEquals("width is 5 and height is 10", "width is " + this.width+ " and height is "+ this.height);
    }
}

