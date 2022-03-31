package 쓰레드음악연습2;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.File;

public class 음악6beep {
    public static void audio() {
        try {
            File file = new File("c:/abc/beep.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            //clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.loop(3);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }

    private static String arg;
public static void main(String[] args){
    arg = "c:/abc/빠라밤.wav";
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon(arg);
    frame.setSize(500, 300);
    frame.setVisible(true);
    label.setIcon(icon);
    panel.add(label);
    frame.getContentPane().add(panel);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    audio();
    System.out.println("111");




        }
    }
