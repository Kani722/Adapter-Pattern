public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        // don't do anything
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.name: "+ fileName);
    }
}
