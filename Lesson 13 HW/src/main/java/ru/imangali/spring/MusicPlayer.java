package ru.imangali.spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private Random random = new Random();

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public String playMusic() {
        int ind = random.nextInt(musicList.size());

        return musicList.get(ind).getSong();
    }
}
