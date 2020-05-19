package learning;

import learning.cars.Truck;
import learning.cars.Speedster;
import learning.cars.Mutant;
import learning.cars.CrashCar;
import learning.helpers.CarSort;
import learning.helpers.Random;

public class Main {

    public static void main(String[] args) {

        // create all
        int size = 8;
        int finishDistance = 600;
        int totalClasses = 3;
        int carClassIndex;
        CrashCar[] cars = new CrashCar[size];
        CrashCar newCar = null;
        
        for (int i = 0; i < cars.length; i++) {
            carClassIndex = Random.returnRandom(totalClasses);
            if (carClassIndex == 0) newCar = new Truck();
            else if (carClassIndex == 1) newCar = new Speedster();
            else if (carClassIndex == 2) newCar = new Mutant();
            cars[i] = newCar;
        }
        
        // run cycle
        int crashCount;
        int count = 0;
        CrashCar victor = null;
        String message;
        
        while (true) {
            count++;
            crashCount = 0;
            for (CrashCar car : cars) {
                if (Math.random() > 0.25) car.accelerate();
                else car.decelerate();
                if (car.getDistance() >= finishDistance && (victor == null || car.getDistance() > victor.getDistance())) {
                    // if one than more crossed - check
                    victor = car;
                    // optionally try to pick a winner in case of tie...
                }
            }
            
            CarSort.sortCars(cars);
            CrashCar car;
            for (int i = 0; i < cars.length; i++) {
                car = cars[i];
                if (car.getHaveCrashed()) {
                    message = "<CRASHED> ";
                    crashCount++;
                } else message = "";
                
                message += car.getColor() + " " + car.getType() + " [travelled: " + car.getDistance() + ", max velocity: " + car.getVelocity() + " (" + car.getVelocityChange() + ")]";
                System.out.println(message);
            }
            
            System.out.println("=====================<< " + count + " >>===================");
            // if all crashed - end
            if (crashCount == size) {
                System.out.println("All have crashed - GLORY!!!");
                break;
            }
            // if at least one crossed - end
            if (victor != null) {
                System.out.println("Finish!!!");
                System.out.println("Loser who won is: " + victor.getColor() + " " + victor.getType() + " traveled: " + victor.getDistance());
                break;
            }
            // else - continue
        }      
        
    }

}