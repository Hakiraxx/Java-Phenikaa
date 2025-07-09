/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author TanDungNguyen
 */
public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(float x, float y, float z){
       super(x,y);
       this.z = z;
    }
    
    public Point3D(){
       super();
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public void SetXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
    
}
