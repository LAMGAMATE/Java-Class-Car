public class Main {
    public static void main(String[] args) {
        Car firstcar = new Car();
        firstcar.speed = 210;
        firstcar.enginePower = 120;
        firstcar.color = "black";
        firstcar.name = "Ferrari";
        firstcar.start();
        firstcar.stop();
        firstcar.changeGear();
    }
}
