package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    } //создание бинов вручную

    @Bean
    public  RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
