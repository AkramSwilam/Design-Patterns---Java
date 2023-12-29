package shape_and_color;

public abstract class Shape {
    Color color;
    Shape(Color color){
        this.color=color;
    }

    public void colorOp(){
        this.color.fillColor();
    }
}
