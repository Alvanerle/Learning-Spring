package ru.imangali.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(Genre.ROCK));
        System.out.println(musicPlayer.playMusic(Genre.CLASSICAL));

        context.close();
    }
}
