package Car;

import Car.Brake.BrakeType;
import Car.Brake.Pads;
import Car.Engine.DieselEngine;
import Car.Engine.engine;
import Car.Media.Dolby;
import Car.Media.Media;

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
