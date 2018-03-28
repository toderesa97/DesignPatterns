package adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing vlc file "+filename);
    }
    
}
