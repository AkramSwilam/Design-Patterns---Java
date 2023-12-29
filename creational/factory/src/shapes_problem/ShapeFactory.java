package shapes_problem;

import java.util.Objects;

public class ShapeFactory {
    public Shape createShape(String s){
        if(Objects.equals(s, "square"))
            return new Square();
        if (Objects.equals(s, "circle"))
            return new Circle();
        return null;
    }
}
