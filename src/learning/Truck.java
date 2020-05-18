package learning;

/*
A dusty, slow and unremarkable "workhorse" of the Wasteland driven by angry dudes who beat their lovers and talk rude all the time
*/
public class Truck extends CrashCar {
    
    protected String[] newTypes = {"'Kamaz'", "'Ural'", "'Bombardeer'"};
    protected String[] newColors = {"-Dirt-", "-Beige-", "-Dust-", "-Filth-"};
    
    Truck() {
        this.maxVelocity = 50;
        this.acceleration = 5;
        this.deceleration = 2;
        this.crashChance = 0.05;
        this.types = this.newTypes;
        this.colors = this.newColors;
        this.initCar();
    }
    
}
