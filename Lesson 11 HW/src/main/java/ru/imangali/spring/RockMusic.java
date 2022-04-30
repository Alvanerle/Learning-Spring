package ru.imangali.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Purple Haze");
        songs.add("Whole Lotta Love");
        songs.add("Sympathy for the Devil");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
