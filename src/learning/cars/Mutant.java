package learning.cars;

import learning.interfaces.ISpecificVechicle;

/*
A terrifying abomination born out of the nuclear fallout that stalks the survivors, they never stop, they're always looking for victims!
*/
public class Mutant extends AbstractCar implements ISpecificVechicle {
    
    private final String[] newTypes = {"naked fat bald angry man on foot", "limping one legged, one eyed monster"};
    private final String[] newColors = {"-Flesh-", "-Tatoo-"};
    
    public Mutant() {
        this.maxVelocity = 10;
        this.acceleration = 2;
        this.deceleration = 2;
        this.crashChance = 0;
        this.types = this.newTypes;
        this.colors = this.newColors;
        super.initCar();
    }
    
    @Override
    public void cheer() {
        System.out.println("Eats you alive and turns to one of them!");
    }
    
}
