public class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(12);
        Cylinder c3 = new Cylinder("orange",3.5,14);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c3.getArea());
        System.out.println(c3.getVolume());
    }
}
