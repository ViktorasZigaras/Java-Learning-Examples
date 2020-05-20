package learning.cars;

import learning.interfaces.ISpecificVechicle;

/*
A totally unsafe death trap of a vechicle "driven" by psychotic wackjobs on drugs, no safeties are obviously provided (useless melee weapons and sharp spiky shoulder guards are a must!)
*/
public class Speedster extends AbstractCar implements ISpecificVechicle {
    
    private final String[] newTypes = {"'Crazy'", "'Wheelster'", "'Tricycle'"};
    private final String[] newColors = {"-Ice-", "-M-M-Metal-", "-Dark Heavy Metal-"};
    
    public Speedster() {
        this.maxVelocity = 300;
        this.acceleration = 50;
        this.deceleration = 25;
        this.crashChance = 0.25;
        this.types = this.newTypes;
        this.colors = this.newColors;
        super.initCar();
    }
    
    @Override
    public void cheer() {
        System.out.println("Dies from overdose and is replaced by another fucking desert chem junkie!");
    }
    
}
