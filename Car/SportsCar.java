package car;

import car.Brake.BrakeType;
import car.Brake.Disc;
import car.Engine.PetrolEngine;
import car.Engine.engine;
import car.Media.Kenwood;
import car.Media.Media;

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
