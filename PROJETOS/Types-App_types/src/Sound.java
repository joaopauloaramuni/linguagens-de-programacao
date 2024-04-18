/*!*********************************************************
 *  Sound 
 * =======
 * @author: Randolfo A Goncalves
 * @since:  29/03/24
 * @file:   Sound.java 
 *
 * Classe dedicada para efeitos sonoros.
************************************************************/
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class Sound{
    static void play(String sound){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(sound));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            //clip.loop(0); 
            clip.start();
            clip.close();
        }catch(Exception e){ e.printStackTrace(); }
    }
}
