package db.ocp.solution;


public class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("I'm a circle whose radius = " + radius);
    }
}
