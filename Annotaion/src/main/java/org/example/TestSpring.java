package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");



     /*    Music music = context.getBean("classicalMusic", Music.class);
         MusicPlayer musicPlayer = new MusicPlayer(music);
         musicPlayer.playMusic();

         Music music2 = context.getBean("rockMusic", RockMusic.class);
         MusicPlayer rockMusicPlayer = new MusicPlayer(music2);
         rockMusicPlayer.playMusic();*/

/*        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

       /* Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        /*ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);*/


        context.close();
    }
}
