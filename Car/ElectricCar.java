package Car;

import Car.Brake.BrakeType;
import Car.Brake.Disc;
import Car.Brake.Pads;
import Car.Engine.ElectricEngine;
import Car.Engine.PetrolEngine;
import Car.Engine.engine;
import Car.Media.Dolby;
import Car.Media.Kenwood;
import Car.Media.Media;

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
