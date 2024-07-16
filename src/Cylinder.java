public class Cylinder  extends Circle implements Volume{
    double height;

    public Cylinder(double height, double radius, String name){
        super(6,9);
        this.height = height;
    }
}
