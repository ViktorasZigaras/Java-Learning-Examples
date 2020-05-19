package learning.notes;

public class Notes {}

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
