package learning.cars;

import learning.helpers.Random;
import learning.interfaces.IVechicle;

/*
A blueprint for all cars
*/
abstract public class AbstractCar implements IVechicle {
    
    protected String type;
    protected String color;
    protected int distance = 0;
    protected int velocity = 0;
    protected int velocityChange = 0;
    protected boolean isCrashed = false;
    protected int maxVelocity = 200;
    protected int minVelocity = 0;
    protected int acceleration = 10;
    protected int deceleration = 5;
    protected double crashChance = 0.1;
    protected String[] types = {"'no type'"};
    protected String[] colors = {"-no color-"};
    
    public AbstractCar() {
        this("", "");
    };
    // unused for the time being
    public AbstractCar(String type, String color) {
        this.type = type;
        this.color = color;
    }
    
    @Override
    public String getType() {return this.type;}
    @Override
    public void setType(String title) {this.type = title;}
    @Override
    public String getColor() {return this.color;}
    @Override
    public void setColor(String color) {this.color = color;}
    @Override
    public String[] getTypes() {return this.types;}
    @Override
    public String[] getColors() {return this.colors;}
    @Override
    public int getDistance() {return this.distance;}
    @Override
    public int getVelocity() {return this.velocity;}
    @Override
    public int getVelocityChange() {return this.velocityChange;}
    @Override
    public boolean getHaveCrashed() {return this.isCrashed;}
    @Override
    public void accelerate() {
        if (!this.isCrashed) {
            this.velocityChange = Random.returnRandom(acceleration);
            changeVelocity();
            if (this.velocity > this.maxVelocity) this.velocity = maxVelocity;
        } else this.velocityChange = 0;
    }
    @Override
    public void decelerate() {
        if (!this.isCrashed) {
            this.velocityChange = -Random.returnRandom(deceleration);
            changeVelocity();
            if (this.velocity < this.minVelocity) this.velocity = minVelocity;
        } else this.velocityChange = 0;
    }
    @Override
    public void changeVelocity() {
        this.velocity += this.velocityChange;
        if (!this.isCrashed) {
            if (Math.random() < crashChance) this.isCrashed = true;
            else this.distance += this.velocity;
        }
    }
    
    protected void initCar() {
        this.type = this.types[Random.returnRandom(this.types.length)];
        this.color = this.colors[Random.returnRandom(this.colors.length)];
    }
    
}
