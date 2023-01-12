import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point3D d3=new Point3D(1,3,4);
        System.out.println(d3);
        Point2D d2=new Point3D(2,1,4);
        System.out.println(d2);
        System.out.println(Arrays.toString(d3.getXYZ()));
        if(d2 instanceof Point3D){
            System.out.println(Arrays.toString(((Point3D)d2).getXYZ()));
        }
    }
}