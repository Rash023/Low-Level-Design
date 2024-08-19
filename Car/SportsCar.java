package Car;

import Car.Brake.BrakeType;
import Car.Brake.Disc;
import Car.Engine.PetrolEngine;
import Car.Engine.engine;
import Car.Media.Kenwood;
import Car.Media.Media;

public class SportsCar implements Car{
    private engine EngineType;
    private BrakeType brakeType;
    private Media mediaType;
    public SportsCar(){
        EngineType=new PetrolEngine();
        brakeType=new Disc();
        mediaType=new Kenwood();
    }
    @Override
    public void start() {
        EngineType.start();
    }

    @Override
    public void stop() {
        EngineType.stop();
    }

    @Override
    public void startMusic() {
        mediaType.startMusic();
    }

    @Override
    public void stopMusic() {
        mediaType.stopMusic();
    }

    @Override
    public void brake() {
        brakeType.brake();
    }
}
