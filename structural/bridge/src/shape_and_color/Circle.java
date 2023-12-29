package shape_and_color;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void colorOp() {
        super.colorOp();
        System.out.println("in Circle");
    }
}
