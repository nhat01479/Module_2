package org.example;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);//GỌi hàm khởi tạo 2 tham số của class Point2D
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
//        setX();
//        setY();
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xyz = {getX(),getY(),z};//Vì x,y ở class Point2D là private, muốn truy xuất phải thông qua get(X), get(Y).
        return xyz;
    }

    @Override
    public String toString() {
        return "Toạ độ (x, y, z) = (" + this.getX() + ", " + this.getY() + ", " + this.z + ")";
    }
}
