package 파석5;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {


    void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
        }
    }

    public void bgm(){
        Music music = new Music();
        File Clap1 = new File("c:/abc/게임잔잔.mp3"); //파일 객체를 생성함
        music.PlaySound(Clap1); //메소드 사용
    }
}
