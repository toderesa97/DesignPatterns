package adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing mp4 file "+filename);
    }
    
}
