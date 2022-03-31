package 쓰레드음악연습2;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class 음악2됨 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        File Clap1 = new File("c:/abc/beep.wav"); //파일 객체를 생성함
        PlaySound(Clap1); //메소드 사용
    }

    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
        }
    }
}
