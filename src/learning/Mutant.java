package learning;

/*
A terrifying abomination born out of the nuclear fallout that stalks the survivors, they never stop, they're always looking for victims!
*/
public class Mutant extends CrashCar {
    
    protected String[] newTypes = {"naked fat bald angry man on foot", "limping one legged, one eyed monster"};
    protected String[] newColors = {"-Flesh-", "-Tatoo-"};
    
    Mutant() {
        this.maxVelocity = 10;
        this.acceleration = 2;
        this.deceleration = 2;
        this.crashChance = 0;
        this.types = this.newTypes;
        this.colors = this.newColors;
        this.initCar();
    }
    
}
