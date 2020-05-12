package learning;

public class CrashCar {
    
    private String title;
    private String color;
    private int distance = 0;
    private int velocity = 0;
    private boolean haveCrashed = false;
    private final int maxVelocity = 200;
    private final int minVelocity = 0;
    private final int acceleration = 5;
    private final int deceleration = 3;
    private final double crashChance = 0.05;
    
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
    
    public boolean getHaveCrashed() {
        return this.haveCrashed;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
    
    public void accelerate() {
        if (!this.haveCrashed) {
            this.velocity += (int) (Math.random() * this.acceleration);
        if (this.velocity > this.maxVelocity) this.velocity = this.maxVelocity;
        tryToCrash();
        }
    }
    
    public void decelerate() {
        if (!this.haveCrashed) {
            this.velocity -= (int) (Math.random() * this.deceleration);
            if (this.velocity < this.minVelocity) this.velocity = this.minVelocity;
            tryToCrash();
        }
    }
    
    private void tryToCrash() {
        if (!this.haveCrashed) {
            if (Math.random() < this.crashChance) {
                this.haveCrashed = true;
            }
        }
    }
    
    public void move() {
        if (!this.haveCrashed) {
            this.distance += this.velocity;
        }
    }
    
}
