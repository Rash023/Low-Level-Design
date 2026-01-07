package car;

import car.Brake.BrakeType;
import car.Brake.Pads;
import car.Engine.ElectricEngine;
import car.Engine.engine;
import car.Media.Dolby;
import car.Media.Media;

public class ElectricCar implements Car{
    private engine EngineType;
    private BrakeType brakeType;
    private Media mediaType;
    public ElectricCar(){
        EngineType=new ElectricEngine();
        brakeType=new Pads();
        mediaType=new Dolby();
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
