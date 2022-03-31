package 쓰레드음악연습2;

import javax.sound.sampled.*;
import java.io.File;

public class 음악4 {
    public static void main(String[] args) {

        try {
            File yourFile = null;
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(yourFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            //whatevers
        }
    }
}
