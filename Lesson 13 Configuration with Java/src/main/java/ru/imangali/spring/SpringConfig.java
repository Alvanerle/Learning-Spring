package ru.imangali.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean Computer computer(){
        return new Computer(musicPlayer());
    }
}
