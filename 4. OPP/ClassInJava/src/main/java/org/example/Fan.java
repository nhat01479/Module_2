package org.example;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("green");
        fan2.setStatus(false);
        System.out.println(fan2.toString());
    }
    //Constant speed
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    //Fan variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    /*------------ set ----------*/
    public void setSpeed(int newSpeed) {
        if (newSpeed < 0 || newSpeed > 3)
            System.out.println("Khong hop le");
        else
            this.speed = newSpeed;
    }

    public void setStatus(boolean newOn) {
        this.on = newOn;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    /*------------ get ----------*/
    public int getSpeed() {
        return speed;
    }
    public boolean getStatus(boolean on) {
        return on;
    }
    public double getRadius(double radius) {
        return radius;
    }
    public String getColor(String color) {
        return color;
    }
    public String toString(){
        if (on)
            return "Fan is on \nSpeed: " + speed + ", Status: " + on + ", Radius: " + radius + ", Color: " + color;
        else
            return  "Fan is off \nRadius: " + radius + ", Color: " + color;
    }

}
