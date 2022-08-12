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
            File backgroundMusic = new File("sounds/fun-life-112188.wav");
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
}
