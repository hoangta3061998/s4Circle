public class Cylinder extends  Circle {
    private double height;

    public Cylinder() {
        height = 1.0;
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(String color , double radius , double height){
        super(color,radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public double getArea(){
        return super.getArea()*2 + 2*getRadius()*getHeight()*Math.PI;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with color of "+ getColor() + " and radius is " + getRadius() + " height :" + getHeight();
    }
}
