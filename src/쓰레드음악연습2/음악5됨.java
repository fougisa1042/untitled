package 쓰레드음악연습2;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class 음악5됨 {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

        while (true) {
            File a = new File("c:/abc/beep.wav");
            AudioInputStream b = AudioSystem.getAudioInputStream(a);
            Clip c = AudioSystem.getClip();
            c.open(b);
            c.start();
            Thread.sleep(c.getMicrosecondLength() / 1000);
        }

    }
}
