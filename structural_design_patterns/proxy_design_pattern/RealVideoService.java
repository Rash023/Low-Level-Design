package structural_design_patterns.proxy_design_pattern;

public class RealVideoService implements VideoServiceInterface {
    @Override
    public void playVideo(String userType, String videoName) {
        System.out.println("Streaming video: " + videoName);
    }
}