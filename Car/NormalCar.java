package car;

import car.Brake.BrakeType;
import car.Brake.Pads;
import car.Engine.DieselEngine;
import car.Engine.engine;
import car.Media.Dolby;
import car.Media.Media;

public class NormalCar implements Car{
    private engine EngineType;
    private BrakeType brakeType;
    private Media mediaType;
    public NormalCar(){
        EngineType=new DieselEngine();
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
