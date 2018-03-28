package adapter;

import java.util.Arrays;
import java.util.List;



public class MediaAdapter implements MediaPlayer {
    
    // actually MediaPlayer interface does not make sense here! This is just here if new 
    // implementation of media adapters appeared.
    public static List<String> availableFormats = Arrays.asList("mp4", "vlc");
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else {
            advancedMediaPlayer = null;
        }
    }
    
    @Override
    public void play(String filename) {
        if (advancedMediaPlayer != null) {
            String[] name = filename.split("[.]");
            if (availableFormats.contains(name[name.length-1])) {
                advancedMediaPlayer.play(filename);
            } else {
                try {
                    throw new IllegalMediaExtension("Could not play invalid format");
                } catch (IllegalMediaExtension ex) {
                    ex.printStackTrace();
                }
            }
           
        } else {
            try {
                throw new IllegalMediaExtension("Could not play. Adapter not created");
            } catch (IllegalMediaExtension ex) {
                ex.printStackTrace();
            }
        }   
        
    }
    
}
