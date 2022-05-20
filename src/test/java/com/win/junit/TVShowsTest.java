package com.win.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TVShowsTest {

    @Test
    void getEpisodes(){

        TVShows shows = new TVShows("Game of Throns", 30, null);
        assertEquals(30, shows.getEpisodes());
}
}
