package db.ocp.solution;



public class Main {

   public static void main(String[] args) {
       Paint paint = new Paint();
       paint.draw(new Rectangle(8,2));
       paint.draw(new Circle(5));
       paint.draw(new Square(4));
   }

}
