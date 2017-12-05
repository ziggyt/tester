import java.util.Random;


public class CarFactory {

    private Car currentCar;
    private String availableCars[] = {"Volvo", "Saab95", "Scania"};
    private int randomInt;


    int getRandomInt() {

        Random random = new Random();
        randomInt = random.nextInt(2);
        return randomInt;
    }

    Car getNewVehicle(String carModel) {

        carModel = carModel.toLowerCase();

        if (carModel.equals("random")) {
            carModel = availableCars[getRandomInt()];
        }

        switch (carModel) {
            case "volvo":
                return new Volvo240();
            case "saab95":
                return new Saab95();
            case "scania":
                return new Scania();
            default:
                return null;

        }
    }

}
