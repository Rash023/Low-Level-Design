package Car;

public class Main {
    public static void main(String[] args) {
        SportsCar s1=new SportsCar();
        s1.start();
        NormalCar n1=new NormalCar();
        n1.start();
        ElectricCar e1=new ElectricCar();
        e1.start();
        s1.startMusic();
        s1.brake();
    }
}
