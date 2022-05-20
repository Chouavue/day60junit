package com.win.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    void getName(){
        Book books = new Book("Harry Potter");

        assertEquals("Harry Potter", books.getName());
    
    }
}
