package db.ocp.solution;

public class Square extends Shape{

    private int length;

    public Square(int length) {
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("I'm a Square whose length = " + length);
    }
}
