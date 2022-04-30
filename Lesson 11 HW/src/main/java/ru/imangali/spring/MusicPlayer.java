package ru.imangali.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        Random random = new Random();

        if(genre == Genre.ROCK){
            int ind = random.nextInt(music1.getSong().size());
            return music1.getSong().get(ind);
        }
        else if(genre == Genre.CLASSICAL){
            int ind = random.nextInt(music2.getSong().size());
            return music2.getSong().get(ind);
        }

        return "Not found";
    }
}
