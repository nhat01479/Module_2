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
        fan2.setColor("blue");
        fan2.setStatus(false);
        System.out.println(fan2.toString());
    }
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    /*------------ set ----------*/
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
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
