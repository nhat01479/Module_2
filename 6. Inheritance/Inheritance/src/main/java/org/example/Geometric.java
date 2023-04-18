package org.example;
/* Lớp cha - super class - Geometric*/
public class Geometric {
    public static void main(String[] args) {

    }
    private String  color = "white";
    private String  filled = null;
/*  Contructor    */
    public Geometric() {
    }
    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }
/*  getter/ setter  */

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFilled() {
        return filled;
    }
    public void setFilled(String filled) {
        this.filled = filled;
    }
@Override
    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }


}
