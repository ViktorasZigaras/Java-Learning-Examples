package learning;

public class Learning {

    public static void main(String[] args) {

        // create all
        String[] types = {"Kamaz", "Ural", "Crazy", "Bombardeer", "Wheelster", "Tricycle", "naked fat bald angry man on foot"};
        String[] colors = {"Dirt", "Beige", "Dust", "Filth", "Ice", "Flesh", "M-M-Metal"};
        int size = 8;
        int finishDistance = 300;
        int type;
        int color;
        String message;
        CrashCar[] cars = new CrashCar[size];
        CrashCar car;
        for (int i = 0; i < cars.length; i++) {
            type = (int) (Math.random() * types.length);
            color = (int) (Math.random() * colors.length);
            cars[i] = new CrashCar(types[type], colors[color]);
        }
        // run cycle
        int crashCount;
        int count = 0;
        CrashCar victor = null;
        while (true) {
            count++;
            crashCount = 0;
            for (CrashCar car1 : cars) {
                car = car1;
                if (Math.random() > 0.25) car.accelerate();
                else car.decelerate();
                car.move();
                if (car.getHaveCrashed()) {
                    message = "<CRASHED> ";
                    crashCount++;
                } else message = "";
                message += car.getColor() + " " + car.getTitle() + " travelled: " + car.getDistance() + ", velocity: " + car.getVelocity();
                System.out.println(message);
                if (car.getDistance() >= finishDistance) {
                    // optionally can join two ifs
                    if (victor == null || car.getDistance() > victor.getDistance()) {
                        // if one than more crossed - check
                        victor = car;
                    }
                    // optionally try to pick a winner in case of tie...
                }
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
                System.out.println("Loser who won is: " + victor.getColor() + " " + victor.getTitle() + " travelled: " + victor.getDistance());
                break;
            }
            // else - continue
        }      
        
    }

}

//sout + tab - sys out

/*int dydis = 20;
char[][] laukas = new char[dydis][dydis];
// Sugeneruojam pradini lauka
for (int i = 0; i < laukas.length; i++) {
    for (int j = 0; j < laukas[i].length; j++) {
        if (Math.random() < 0.22) {
            laukas[i][j] = 'X';
        } else {
            laukas[i][j] = '.';
        }
    }
}
// Spausdinam esama lauka
char[][] cloneLaukas = new char[dydis][dydis];

for (int i = 0; i < laukas.length; i++) {
    for (int j = 0; j < laukas[i].length; j++) {
//                System.out.print(laukas[i][j]);
        cloneLaukas[i][j] = laukas[i][j];
    }
    System.out.println();
}

for (int i = 0; i < cloneLaukas.length; i++) {
    for (int j = 0; j < cloneLaukas[i].length; j++) {
        System.out.print(cloneLaukas[i][j]);
    }
    System.out.println();
}*/


/*int[] arr = new int[6];
int number;
for (int i = 0; i < 10000; i++) {
    number = (int) (Math.random() * 6);
    arr[number]++;
}
int avg = (int) 10000 / 6;
System.out.println(avg + " average");
for (int i = 0; i < arr.length; i++) {
    number = arr[i];
    System.out.println(number + " " + (i + 1) + "'s; deviation: " + Math.abs(number - avg));
}*/

/*int a = 0;
int sum = 0;
while (a++ < 10) {
    sum += a * a;
}
System.out.println(sum);*/

//    determinant(1, -2, 3);
//    determinant(1, 1, 1);
//    determinant(2, 5, 3);
/*static public void determinant(double a, double b, double c) {
    //b^2 - 4ac
    double det = b * b - 4 * a * c;
    System.out.println(det + " det");
    if (det < 0) {
        System.out.println("Complex number!");
    } else {
        double firstRoot = (-b - Math.sqrt(det)) / (2 * a);
        double secondRoot = (-b + Math.sqrt(det)) / (2 * a);
        System.out.println(firstRoot + " first " + secondRoot + " second");
//            System.out.println("{0}, {1}", firstRoot, secondRoot);
    }
    //-b +- det / 2a
}*/
