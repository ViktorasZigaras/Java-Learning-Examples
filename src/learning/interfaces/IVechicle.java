package learning.interfaces;

public interface IVechicle {
    public String getType();
    public void setType(String title);
    public String getColor();
    public void setColor(String color);
    public String[] getTypes();
    public String[] getColors();
    public int getDistance();
    public int getVelocity();
    public int getVelocityChange();
    public boolean getHaveCrashed();
    public void accelerate();
    public void decelerate();
    public void changeVelocity();
}
