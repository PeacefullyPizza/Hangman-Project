import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sounds {
    // To play continuous royalty free background music
    public static void backgroundMusic() {
        try {
            Scanner scanner = new Scanner(System.in);
            // load the .wav file for background music
            File backgroundMusic = new File("sounds/background_music.wav");
            AudioInputStream backgroundAudioStream = AudioSystem.getAudioInputStream(backgroundMusic);
            Clip clip = AudioSystem.getClip();
            clip.open(backgroundAudioStream);
            // Begin playback
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
        }
    }

    public static void winnerSound() {
        try {
            Scanner scanner = new Scanner(System.in);
            // load the .wav file for background music
            File winnerSound = new File("sounds/winning_sound.wav");
            AudioInputStream winnerAudioStream = AudioSystem.getAudioInputStream(winnerSound);
            Clip clip = AudioSystem.getClip();
            clip.open(winnerAudioStream);
            // Begin playback
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
        }
    }
    public static void losingSound() {
        try {
            Scanner scanner = new Scanner(System.in);
            // load the .wav file for background music
            File losingSound = new File("sounds/gameover_sound.wav");
            AudioInputStream losingAudioStream = AudioSystem.getAudioInputStream(losingSound);
            Clip clip = AudioSystem.getClip();
            clip.open(losingAudioStream);
            // Begin playback
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
        }
    }
}
