package db.Lsp.solution;

public class Rectangle implements Shape {
    protected int width;
    protected int height;


    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return width * height;
    }
}
