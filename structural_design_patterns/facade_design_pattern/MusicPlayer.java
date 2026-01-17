package structural_design_patterns.facade_design_pattern;

public class MusicPlayer {
    public void initializeAudioDrivers() {
        System.out.println("Audio drivers initialized.");
    }
    public void decodeAudio() {
        System.out.println("Audio decoded.");
    }
    public void startPlayback() {
        System.out.println("Music playback started.");
    }
}