public class Circle {
    private String color;
    private double radius;

    public Circle() {
        this.color = "black";
        this.radius = 1.0;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return "A Circle with color of "+ getColor() + " and radius is "+getRadius();
    }
}
