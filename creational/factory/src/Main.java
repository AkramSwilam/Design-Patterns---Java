import files_problem.File;
import files_problem.FileFactory;
import shapes_problem.Shape;
import shapes_problem.ShapeFactory;

public class Main {
    public static void main(String[] args) {
//        FileFactory fileFactory=new FileFactory();
//        File file=fileFactory.createFile("PDF");
//        file.open("new file");

        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.createShape("circle");
        shape.draw();
    }
}