package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());





        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

     /*   MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comp = musicPlayer == secondMusicPlayer;

        System.out.println(comp);
        System.out.println(musicPlayer);//вывод хэша
        System.out.println(secondMusicPlayer);

        musicPlayer.setVolume(10);
        System.out.println(musicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        musicPlayer.playMusic();


        System.out.println("List:");
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer2.playMusicList();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
*/
        context.close();
    }
}
