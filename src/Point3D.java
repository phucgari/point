public class Point3D extends Point2D{
    private float z;
    Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    Point3D(){
        super();
        z=0;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr={super.getX(),super.getY(),getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()+","+z;
    }
}
