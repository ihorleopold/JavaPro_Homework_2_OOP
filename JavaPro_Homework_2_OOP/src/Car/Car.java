package Car;

public class Car {

    public void start() {

        startElectricity();
        startFuelSystem();
        startCommand();

    }

    private void startElectricity() {
        System.out.println("Electricity ON");
    }

    private void startFuelSystem() {
        System.out.println("Fuel ON");
    }

    private void startCommand() {
        System.out.println("Engine ON");
    }

}
