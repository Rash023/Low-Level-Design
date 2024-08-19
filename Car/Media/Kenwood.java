package Car.Media;

public class Kenwood implements Media{
    @Override
    public void startMusic() {
        System.out.println("Starting Kenwood Media Player");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping Kenwood media player");
    }

    @Override
    public void nextMusic() {
        System.out.println("Changing song in Kenwood media player");
    }
}
