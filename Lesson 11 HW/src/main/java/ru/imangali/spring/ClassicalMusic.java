package ru.imangali.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Eine kleine Nachtmusik");
        songs.add("Für Elise");
        songs.add("O mio babbino caro' from Gianni Schicchi");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
