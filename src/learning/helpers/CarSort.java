package learning.helpers;

import learning.cars.AbstractCar;

public final class CarSort {
    
    public static void sortCars(AbstractCar[] cars) {
        boolean run = true;
        AbstractCar current;
        AbstractCar next;
        AbstractCar temp;
        int start = 0;
        while (run) {
            run = false;
            for (int i = start; i < cars.length - 1; i++) {
                current = cars[i];
                next = cars[i + 1];
                if (current.getDistance() < next.getDistance()) {
                    temp = current;
                    cars[i] = next;
                    cars[i + 1] = temp;
                    run = true;
                }
            }
            start++;
//            if (start > cars.length) break; - optional infinity breaker
        }
    }
    
}
