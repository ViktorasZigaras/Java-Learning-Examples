package learning;

public class CrashCar {
    
    private final String title;
    private final String color;
    private int distance = 0;
    private int velocity = 0;
    private int velocityChange = 0;
    private boolean isCrashed = false;
    private final int maxVelocity = 200;
    private final int minVelocity = 0;
    private final int acceleration = 10;
    private final int deceleration = 5;
    private final double crashChance = 0.1;
    
    CrashCar(String title, String color) {
        this.title = title;
        this.color = color;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getDistance() {
        return this.distance;
    }
    
    public int getVelocity() {
        return this.velocity;
    }
    
    public int getVelocityChange() {
        return this.velocityChange;
    }
    
    public boolean getHaveCrashed() {
        return this.isCrashed;
    }
    
    public void accelerate() {
        if (!this.isCrashed) {
            this.velocityChange = (int) (Math.random() * acceleration);
            changeVelocity();
            if (this.velocity > this.maxVelocity) this.velocity = maxVelocity;
        } else this.velocityChange = 0;
    }
    
    public void decelerate() {
        if (!this.isCrashed) {
            this.velocityChange = (int) (-Math.random() * deceleration);
            changeVelocity();
            if (this.velocity < this.minVelocity) this.velocity = minVelocity;
        } else this.velocityChange = 0;
    }
    
    public void changeVelocity() {
        this.velocity += this.velocityChange;
        if (!this.isCrashed) {
            if (Math.random() < crashChance) this.isCrashed = true;
            else this.distance += this.velocity;
        }
    }
    
}
