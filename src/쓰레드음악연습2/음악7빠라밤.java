package 쓰레드음악연습2;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import java.io.*;
public class 음악7빠라밤 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("메인윈도우");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,300);
        frame.setVisible(true);

        File file = new File("c:/abc/양념.wav");
        System.out.println(file.exists()); //true

        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("111");
    }
}
