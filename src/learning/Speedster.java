package learning;

/*
A totally unsafe death trap of a vechicle "driven" by psychotic wackjobs on drugs, no safeties are obviously provided (useless melee weapons and sharp spiky shoulder guards are a must!)
*/
public class Speedster extends CrashCar {
    
    protected String[] newTypes = {"'Crazy'", "'Wheelster'", "'Tricycle'"};
    protected String[] newColors = {"-Ice-", "-M-M-Metal-", "-Dark Heavy Metal-"};
    
    Speedster() {
        this.maxVelocity = 300;
        this.acceleration = 50;
        this.deceleration = 25;
        this.crashChance = 0.25;
        this.types = this.newTypes;
        this.colors = this.newColors;
        this.initCar();
    }
    
}
