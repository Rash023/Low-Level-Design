package Car.Media;

public class Dolby implements Media{
    @Override
    public void startMusic() {
        System.out.println("Starting Dolby media player");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping Dobly media player");
    }

    @Override
    public void nextMusic() {
        System.out.println("Changing song in Dolby media player");
    }
}
