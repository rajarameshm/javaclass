public class MusicPlayer {

    private int currentTrack;

    public MusicPlayer() {
        currentTrack = 1;
    }

    public void playNextTrack() {
        currentTrack = currentTrack + 1;
    }

    public void playPreviousTrack() {
        currentTrack = currentTrack - 1;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }
}
